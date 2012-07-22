package net.dandelarosa.pzdavid;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * The window that plays a game
 * @author dandelarosa
 */
public class GameJFrame extends JFrame implements Runnable {
  /**
   * The serialVersionUID is added in case we want to use serialization for this class. Please
   * generate new a new version ID if this code is modified in the future.
   */
  private static final long serialVersionUID = -3593812959821792463L;

  private RootGameController gameController;

  /**
   * Constructor
   */
  public GameJFrame(RootGameController gameController) {
    this.gameController = gameController;
    
    // Set window parameters
    setTitle(gameController.getGameTitle());
    setSize(gameController.getGameWidth(), gameController.getGameHeight());
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Center the window
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenDimensions = tk.getScreenSize();
    setLocation((screenDimensions.width - this.getWidth()) / 2,
        (screenDimensions.height - this.getHeight()) / 2);

    // Have the GameController process key events
    addKeyListener(gameController);

    // Start the game loop
    Thread gameThread = new Thread(this);
    gameThread.start();

    // Display the window
    setVisible(true);
  }

  /**
   * Runs the game loop
   */
  @Override
  public void run() {
    try {
      while (true) {
        // Update the game state
        gameController.update();

        // Send a call to redraw the scene
        repaint();

        // Wait until next frame
        // Waiting time = 1000ms / frames per second
        Thread.sleep(1000 / gameController.getFramerate());
      }
    } catch (InterruptedException e) {
      // Handles the sleep interrupted exception
    };
  }

  /**
   * Have the game controller draw the current game state
   */
  @Override
  public void paint(Graphics g) {
    // Use double-buffering to prevent flickering
    Image bufferedImage = createImage(this.getWidth(), this.getHeight());
    gameController.paint(bufferedImage.getGraphics());
    g.drawImage(bufferedImage, 0, 0, null);
  }
}

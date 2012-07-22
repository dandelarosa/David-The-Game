package net.dandelarosa.pzdavid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 * Controls the game state for David the Game
 * @author dandelarosa
 */
public class DavidGameController implements RootGameController {
  public static final int SCREEN_WIDTH = 512;
  public static final int SCREEN_HEIGHT = 440;

  // Key press flags
  private boolean moveLeft = false;
  private boolean moveRight = false;
  
  @Override
  public String getGameTitle() {
    return "David the Game";
  }
  
  @Override
  public int getGameWidth() {
    return SCREEN_WIDTH;
  }

  @Override
  public int getGameHeight() {
    return SCREEN_HEIGHT;
  }

  @Override
  public int getFramerate() {
    return 30;
  }

  /**
   * Invoked when a key has been pressed. See the class description for KeyEvent for a definition of
   * a key pressed event.
   */
  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_LEFT:
        moveLeft = true;
        break;
      case KeyEvent.VK_RIGHT:
        moveRight = true;
        break;
    }
  }

  /**
   * Invoked when a key has been released. See the class description for KeyEvent for a definition
   * of a key released event.
   */
  @Override
  public void keyReleased(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_LEFT:
        moveLeft = false;
        break;
      case KeyEvent.VK_RIGHT:
        moveRight = false;
        break;
    }
  }

  /**
   * Invoked when a key has been typed. See the class description for KeyEvent for a definition of a
   * key typed event.
   */
  @Override
  public void keyTyped(KeyEvent e) {
    // Ignore for now - process only presses and releases
    return;
  }

  /**
   * Update the game state each frame
   */
  public void update() {
    if (moveLeft) { }
    if (moveRight) { }
  }

  /**
   * Draw the game state each frame
   * 
   * @param g Graphics to draw onto
   */
  public void paint(Graphics g) {
    // Draw the background image
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
  }
}

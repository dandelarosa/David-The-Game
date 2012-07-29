package net.dandelarosa.pzdavid;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Controls the game state for David the Game
 * @author dandelarosa
 */
public class DavidGameController implements RootGameController {
  public static final int SCREEN_WIDTH = 550;
  public static final int SCREEN_HEIGHT = 400;

  private Input input = new Input();
  private World currentWorld = new SampleWorld(input);
  
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
    return 60;
  }
  
  @Override
  public Input getInputHandler() {
    return input;
  }

  /**
   * Update the game state each frame
   */
  public void update() {
    currentWorld.update();
  }

  /**
   * Draw the game state each frame
   * @param g Graphics to draw onto
   */
  public void paint(Graphics g) {
    // Draw the background image
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
    currentWorld.paint(g);
  }
}

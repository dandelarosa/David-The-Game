package net.dandelarosa.pzdavid;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Handles all key and mouse events.
 * @author dandelarosa
 */
public class Input implements KeyListener{
  private static final int NUM_KEYS = 128;
  private boolean [] isDown = new boolean[NUM_KEYS];
  private boolean [] isPressedThisFrame = new boolean[NUM_KEYS];
  private boolean [] isReleasedThisFrame = new boolean[NUM_KEYS];

  /**
   * Clears some variables for the next frame.
   */
  public void nextFrame() {
    for (int i = 0; i < NUM_KEYS; i++) {
      isPressedThisFrame[i] = false;
      isReleasedThisFrame[i] = false;
    }
  }
  
  /**
   * Invoked when a key has been pressed. See the class description for 
   * KeyEvent for a definition of a key pressed event.
   */
  @Override
  public void keyPressed(KeyEvent e) {
    isPressedThisFrame[e.getKeyCode()] = true;
    isDown[e.getKeyCode()] = true;
  }

  /**
   * Invoked when a key has been released. See the class description for 
   * KeyEvent for a definition of a key released event.
   */
  @Override
  public void keyReleased(KeyEvent e) {
    isReleasedThisFrame[e.getKeyCode()] = true;
    isDown[e.getKeyCode()] = false;
  }

  /**
   * Invoked when a key has been typed. See the class description for KeyEvent 
   * for a definition of a key typed event.
   */
  @Override
  public void keyTyped(KeyEvent e) {
    // Ignore for now - process only presses and releases
    return;
  }
  
  public boolean isDown(int keyCode) {
    return isDown[keyCode];
  }
  
  public boolean isPressed(int keyCode) {
    return isPressedThisFrame[keyCode];
  }
  
  public boolean isReleased(int keyCode) {
    return isPressedThisFrame[keyCode];
  }
}

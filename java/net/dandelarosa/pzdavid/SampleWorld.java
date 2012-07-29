package net.dandelarosa.pzdavid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class SampleWorld implements World {
  private Input input;
  private Player player = new Player();
  
  public SampleWorld(Input input) {
    this.input = input;
  }
  
  @Override
  public void update() {
    if(input.isDown(KeyEvent.VK_LEFT)) {
      player.x -= 5;
    }
    if(input.isDown(KeyEvent.VK_RIGHT)) {
      player.x += 5;
    }
    if(input.isDown(KeyEvent.VK_UP)) {
      player.y -= 5;
    }
    if(input.isDown(KeyEvent.VK_DOWN)) {
      player.y += 5;
    }
  }

  @Override
  public void paint(Graphics g) {
    player.paint(g);
  }
  
  private static class Player {
    float x = 0;
    float y = 0;
    float width = 32;
    float height = 32;
    public void paint(Graphics g) {
      g.setColor(Color.BLACK);
      g.drawRect((int)x, (int)y, (int)width, (int)height);
    }
  }
}

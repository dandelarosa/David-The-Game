package net.dandelarosa.pzdavid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class SampleWorld implements World {
  private Input input;
  private Player player = new Player();
  private Floor floor = new Floor();
  
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
    if(isCollision(player, floor)) {
      System.out.println("Hello World!");
    }
  }

  @Override
  public void paint(Graphics g) {
    player.paint(g);
    floor.paint(g);
  }
  
  private boolean isCollision(Entity first, Entity second) {
    if (first.x + first.width < second.x) {
      return false;
    }
    else if (first.x > second.x + second.width) {
      return false;
    }
    else if (first.y + first.height < second.y) {
      return false;
    }
    else if (first.y > second.y + second.height) {
      return false;
    }
    else {
      return true;
    }
  }
  
  private static abstract class Entity {
    float x;
    float y;
    float width;
    float height;
    public void paint(Graphics g) {
      g.setColor(Color.BLACK);
      g.drawRect((int)x, (int)y, (int)width, (int)height);
    }
  }
  
  private static class Player extends Entity {
    public Player() {
      x = 0;
      y = 0;
      width = 32;
      height = 32;
    }
  }
  
  private static class Floor extends Entity {
    public Floor() {
      x = 0;
      y = 336;
      width = 549;
      height = 32;
    }
  }
}

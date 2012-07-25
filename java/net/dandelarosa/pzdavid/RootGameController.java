package net.dandelarosa.pzdavid;

import java.awt.Graphics;

public interface RootGameController {
  String getGameTitle();
  int getGameWidth();
  int getGameHeight();
  int getFramerate();
  Input getInputHandler();
  void update();
  void paint(Graphics g);
}

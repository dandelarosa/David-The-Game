package net.dandelarosa.pzdavid;

import java.awt.Graphics;
import java.awt.event.KeyListener;

public interface RootGameController extends KeyListener {
  String getGameTitle();
  int getGameWidth();
  int getGameHeight();
  int getFramerate();
  void update();
  void paint(Graphics g);
}

package org.wmc.structure.bridge.bag;

/**
 * 抽象化角色：包
 */
public abstract class Bag {

  protected Color color;

  public void setColor(Color color) {
    this.color = color;
  }

  public abstract String getName();
}

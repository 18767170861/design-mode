package org.wmc.behavior.observer.signallight;

import java.util.EventObject;

/**
 * 信号灯颜色
 */
public class SignalColor extends EventObject {

  private String color; //"红色"和"绿色"

  public SignalColor(Object source, String color) {
    super(source);
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
}

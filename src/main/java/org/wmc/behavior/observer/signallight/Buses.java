package org.wmc.behavior.observer.signallight;

/**
 * 具体观察者类： 公交车
 */
public class Buses implements Vehicle {

  public void see(SignalColor e) {
    if ("红色".equals(e.getColor())) {
      System.out.println("红灯亮，公交车停！");
    } else {
      System.out.println("绿灯亮，公交车行！");
    }
  }
}
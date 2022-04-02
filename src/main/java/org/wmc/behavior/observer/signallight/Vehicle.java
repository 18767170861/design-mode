package org.wmc.behavior.observer.signallight;

import java.util.EventListener;

/**
 * 抽象观察者类：车
 */
public interface Vehicle extends EventListener {

  //事件处理方法，看见
  void see(SignalColor e);
}

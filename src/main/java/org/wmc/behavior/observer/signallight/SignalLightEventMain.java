package org.wmc.behavior.observer.signallight;

public class SignalLightEventMain {

  /**
   * 红色信号灯亮...
   * 红灯亮，轿车停！
   * 红灯亮，公交车停！
   * ------------
   * 绿色信号灯亮...
   * 绿灯亮，轿车行！
   * 绿灯亮，公交车行！
   */
  public static void main(String[] args) {
    SignalLight light = new SignalLight();//交通信号灯（事件源）
    light.addVehicleListener(new Car());  //注册监听器（轿车）
    light.addVehicleListener(new Buses());//注册监听器（公交车）
    light.changeColor("红色");
    System.out.println("------------");
    light.changeColor("绿色");
  }

}

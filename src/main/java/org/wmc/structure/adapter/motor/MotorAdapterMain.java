package org.wmc.structure.adapter.motor;

/**
 * 客户端代码
 */
public class MotorAdapterMain {

  /**
   * 适配器模式测试：
   * 电能发动机驱动汽车！
   */
  public static void main(String[] args) {
    System.out.println("适配器模式测试：");
    Motor motor = (Motor) ReadXML.getObject();
    motor.drive();
  }

}

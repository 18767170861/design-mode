package org.wmc.structure.adapter.motor;

/**
 * 电能适配器
 */
public class ElectricAdapter implements Motor {

  private ElectricMotor emotor;

  public ElectricAdapter() {
    emotor = new ElectricMotor();
  }

  public void drive() {
    emotor.electricDrive();
  }
}

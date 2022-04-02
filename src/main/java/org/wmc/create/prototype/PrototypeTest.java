package org.wmc.create.prototype;

/**
 * 原型模式的测试类
 */
public class PrototypeTest {

  /**
   * 具体原型创建成功！
   * 具体原型复制成功！
   * obj1==obj2?false
   */
  public static void main(String[] args) throws CloneNotSupportedException {
    Realizetype obj1 = new Realizetype();
    Realizetype obj2 = (Realizetype) obj1.clone();
    System.out.println("obj1==obj2?" + (obj1 == obj2));
  }
}

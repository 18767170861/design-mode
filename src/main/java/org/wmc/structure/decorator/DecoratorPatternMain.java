package org.wmc.structure.decorator;

public class DecoratorPatternMain {

  /**
   * 创建具体构件角色
   * 调用具体构件角色的方法operation()
   * ---------------------------------
   * 调用具体构件角色的方法operation()
   * 为具体构件角色增加额外的功能addedFunction()
   */
  public static void main(String[] args) {
    Component p = new ConcreteComponent();
    p.operation();
    System.out.println("---------------------------------");
    Component d = new ConcreteDecorator(p);
    d.operation();
  }
}

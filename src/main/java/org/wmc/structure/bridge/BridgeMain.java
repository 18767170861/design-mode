package org.wmc.structure.bridge;

public class BridgeMain {

  /**
   * 扩展抽象化(Refined Abstraction)角色被访问
   * 具体实现化(Concrete Implementor)角色被访问
   * @param args
   */
  public static void main(String[] args) {
    Implementor imple = new ConcreteImplementorA();
    Abstraction abs = new RefinedAbstraction(imple);
    abs.Operation();
  }
}

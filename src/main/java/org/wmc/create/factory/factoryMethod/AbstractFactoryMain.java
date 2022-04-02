package org.wmc.create.factory.factoryMethod;

public class AbstractFactoryMain {

  /**
   * 类名：org.wmc.build.factory.method.ConcreteFactory1
   * org.wmc.build.factory.method.ConcreteFactory1 cannot be cast to org.wmc.build.factory.method.AbstractFactory
   */
  public static void main(String[] args) {
    try {
      Product a;
      AbstractFactory af;
      af = (AbstractFactory) ReadXML1.getObject();
      a = af.newProduct();
      a.show();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

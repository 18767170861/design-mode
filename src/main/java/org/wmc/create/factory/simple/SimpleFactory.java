package org.wmc.create.factory.simple;

public class SimpleFactory {

  public static Product makeProduct(int kind) {
    switch (kind) {
      case Const.PRODUCT_A:
        return new ConcreteProduct1();
      case Const.PRODUCT_B:
        return new ConcreteProduct2();
    }
    return null;
  }
}

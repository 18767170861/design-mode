package org.wmc.create.factory.simple;

public class ClientMain {

  /**
   * 具体产品1显示...
   * 具体产品2显示...
   * @param args
   */
  public static void main(String[] args) {
    SimpleFactory.makeProduct(Const.PRODUCT_A).show();
    SimpleFactory.makeProduct(Const.PRODUCT_B).show();
  }
}

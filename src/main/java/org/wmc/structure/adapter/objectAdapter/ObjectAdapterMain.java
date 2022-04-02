package org.wmc.structure.adapter.objectAdapter;

/**
 * 客户端代码
 */
public class ObjectAdapterMain {

  /**
   * 对象适配器模式测试：
   * 适配者中的业务代码被调用！
   */
  public static void main(String[] args) {
    System.out.println("对象适配器模式测试：");
    Adaptee adaptee = new Adaptee();
    Target target = new ObjectAdapter(adaptee);
    target.request();
  }

}

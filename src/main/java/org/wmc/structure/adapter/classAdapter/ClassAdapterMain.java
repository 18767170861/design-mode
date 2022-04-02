package org.wmc.structure.adapter.classAdapter;

/**
 * 客户端代码
 */
public class ClassAdapterMain {

  /**
   * 类适配器模式测试：
   * 适配者中的业务代码被调用！
   */
  public static void main(String[] args) {
    System.out.println("类适配器模式测试：");
    Target target = new ClassAdapter();
    target.request();
  }

}

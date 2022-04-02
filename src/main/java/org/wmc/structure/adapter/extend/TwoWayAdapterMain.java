package org.wmc.structure.adapter.extend;

/**
 * 客户端代码
 */
public class TwoWayAdapterMain {

  /**
   * 目标通过双向适配器访问适配者：
   * 适配者代码被调用！
   * -------------------
   * 适配者通过双向适配器访问目标：
   * 目标代码被调用！
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("目标通过双向适配器访问适配者：");
    TwoWayAdaptee adaptee = new AdapteeRealize();
    TwoWayTarget target = new TwoWayAdapter(adaptee);
    target.request();
    System.out.println("-------------------");
    System.out.println("适配者通过双向适配器访问目标：");
    target = new TargetRealize();
    adaptee = new TwoWayAdapter(target);
    adaptee.specificRequest();
  }
}

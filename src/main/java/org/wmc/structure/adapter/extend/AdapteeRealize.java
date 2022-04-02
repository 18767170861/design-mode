package org.wmc.structure.adapter.extend;

/**
 * 适配者实现
 */
public class AdapteeRealize implements TwoWayAdaptee {

  public void specificRequest() {
    System.out.println("适配者代码被调用！");
  }
}
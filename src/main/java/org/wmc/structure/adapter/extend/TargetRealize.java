package org.wmc.structure.adapter.extend;

/**
 * 目标实现
 */
public class TargetRealize implements TwoWayTarget {

  public void request() {
    System.out.println("目标代码被调用！");
  }
}

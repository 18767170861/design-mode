package org.wmc.structure.adapter.classAdapter;

/**
 * 类适配器类
 */
public class ClassAdapter extends Adaptee implements Target {
  public void request() {
    specificRequest();
  }
}

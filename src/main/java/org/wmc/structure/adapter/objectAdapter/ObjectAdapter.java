package org.wmc.structure.adapter.objectAdapter;

/**
 * 对象适配器类
 */
public class ObjectAdapter implements Target {

  private Adaptee adaptee;

  public ObjectAdapter(Adaptee adaptee) {
    this.adaptee=adaptee;
  }

  public void request() {
    adaptee.specificRequest();
  }
}

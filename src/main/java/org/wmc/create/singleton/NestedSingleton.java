package org.wmc.create.singleton;

/**
 * 嵌套类:
 * 注意，很多人都会把这个嵌套类 说成是静态内部类 ，严格地说，内部类和嵌套类是不一样的，它们能访问的外部类权限也是不一样的
 *
 */
public class NestedSingleton {

  private NestedSingleton() {
  }

  private static class Holder {
    private static NestedSingleton instance = new NestedSingleton();
  }

  public static NestedSingleton getInstance() {
    return Holder.instance;
  }
}

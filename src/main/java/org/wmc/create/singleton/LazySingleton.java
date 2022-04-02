package org.wmc.create.singleton;

/**
 * 懒汉式单例 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例
 */
public class LazySingleton {
  // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的，保证 instance 在所有线程中同步
  private static volatile LazySingleton instance = null;    //

  private LazySingleton() {
  }    //private 避免类在外部被实例化

  // 双重检查，指的是两次检查 instance 是否为 null。
  public static LazySingleton getInstance() {
    if (instance == null) {
      // 加锁
      synchronized (LazySingleton.class){
        // 这一次判断也是必须的，不然会有并发问题
        if (instance == null) {
          instance = new LazySingleton();
        }
      }
    }
    return instance;
  }

}

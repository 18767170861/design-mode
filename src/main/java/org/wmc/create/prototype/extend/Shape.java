package org.wmc.create.prototype.extend;

/**
 * 抽象原型
 */
public interface Shape extends Cloneable{
  public Object clone();    //拷贝
  public void countArea();    //计算面积
}

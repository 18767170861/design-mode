package org.wmc.structure.flyweight;

/**
 * 抽象享元角色
 */
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}

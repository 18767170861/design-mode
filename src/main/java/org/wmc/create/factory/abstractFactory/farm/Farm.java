package org.wmc.create.factory.abstractFactory.farm;

/**
 * 抽象工厂：农场类
 */
public interface Farm {
    public Animal newAnimal();
    public Plant newPlant();
}

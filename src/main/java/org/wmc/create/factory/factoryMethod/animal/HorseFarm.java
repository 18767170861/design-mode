package org.wmc.create.factory.factoryMethod.animal;

/**
 * 具体工厂：养马场
 */
public class HorseFarm implements AnimalFarm{

    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}

package org.wmc.create.factory.factoryMethod.bicycle;

/**
 * 具体工厂：雅迪工厂
 */
public class YadeaFactory implements BicycleFactory {
    public Bicycle produce() {
        System.out.println("雅迪自行车生产了！");
        return new YadeaBicycle();
    }
}

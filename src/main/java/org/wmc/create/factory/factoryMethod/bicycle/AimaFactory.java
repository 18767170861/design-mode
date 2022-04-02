package org.wmc.create.factory.factoryMethod.bicycle;

/**
 * 具体工厂：爱玛工厂
 */
public class AimaFactory implements BicycleFactory {
    public Bicycle produce() {
        System.out.println("爱玛自行车生产了！");
        return new AimaBicycle();
    }
}

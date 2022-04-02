package org.wmc.structure.flyweight;

/**
 * 客户角色
 */
public class FlyweightPatternMain {

    /**
     * 具体享元a被创建！
     * 具体享元a已经存在，被成功获取！
     * 具体享元a已经存在，被成功获取！
     * 具体享元b被创建！
     * 具体享元b已经存在，被成功获取！
     * 具体享元a被调用，非享元信息是:第1次调用a。
     * 具体享元a被调用，非享元信息是:第2次调用a。
     * 具体享元a被调用，非享元信息是:第3次调用a。
     * 具体享元b被调用，非享元信息是:第1次调用b。
     * 具体享元b被调用，非享元信息是:第2次调用b。
     */
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        Flyweight f11 = factory.getFlyweight("b");
        Flyweight f12 = factory.getFlyweight("b");
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }
}

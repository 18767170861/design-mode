package org.wmc.behavior.mediator;

/**
 * 客户类
 */
public class MediatorPatternMain {

    /**
     * 具体同事类1发出请求。
     * 具体同事类2收到请求。
     * -------------
     * 具体同事类2发出请求。
     * 具体同事类1收到请求。
     */
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}

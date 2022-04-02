package org.wmc.behavior.mediator.extend;

/**
 * 客户类
 */
public class SimpleMediatorPatternMain {

    /**
     * 具体同事类1：发出请求...
     * 具体同事类2：收到请求。
     * -----------------
     * 具体同事类2：发出请求...
     * 具体同事类1：收到请求。
     */
    public static void main(String[] args) {
        SimpleColleague c1, c2;
        c1 = new SimpleConcreteColleague1();
        c2 = new SimpleConcreteColleague2();
        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}

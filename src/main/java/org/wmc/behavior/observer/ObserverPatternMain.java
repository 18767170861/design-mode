package org.wmc.behavior.observer;

/**
 * 客户类
 */
public class ObserverPatternMain {

    /**
     * 具体目标发生改变...
     * --------------
     * 具体观察者1作出反应！
     * 具体观察者2作出反应！
     */
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }

}

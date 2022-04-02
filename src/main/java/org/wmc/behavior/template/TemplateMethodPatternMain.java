package org.wmc.behavior.template;

/**
 * 客户类
 */
public class TemplateMethodPatternMain {

    /**
     * 抽象类中的具体方法被调用...
     * 抽象方法1的实现被调用...
     * 抽象方法2的实现被调用...
     */
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}

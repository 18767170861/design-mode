package org.wmc.behavior.template.hook;

/**
 * 客户类
 */
public class HookTemplateMethodMain {

    /**
     * 抽象方法1的实现被调用...
     * 钩子方法1被重写...
     * 抽象方法2的实现被调用...
     */
    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.TemplateMethod();
    }
}

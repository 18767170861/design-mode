package org.wmc.behavior.chain;

/**
 * 客户类
 */
public class ChainOfResponsibilityPatternMain {

    /**
     * 具体处理者2负责处理该请求！
     */
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}

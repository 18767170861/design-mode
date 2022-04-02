package org.wmc.behavior.strategy;

/**
 * 客户端
 */
public class StrategyPatternMain {

    /**
     * 具体策略A的策略方法被访问！
     * -----------------
     * 具体策略B的策略方法被访问！
     */
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}



package org.wmc.behavior.strategy.cook;

/**
 * 环境类：厨房
 */
public class Kitchen {

    private CrabCooking strategy;    //抽象策略

    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }

    public CrabCooking getStrategy() {
        return strategy;
    }

    public void CookingMethod() {
        strategy.CookingMethod();    //做菜
    }
}

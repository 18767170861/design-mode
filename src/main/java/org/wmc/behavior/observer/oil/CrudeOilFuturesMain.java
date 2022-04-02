package org.wmc.behavior.observer.oil;

import java.util.Observer;

/**
 * 客户类
 */
public class CrudeOilFuturesMain {

    /**
     * 油价上涨10.0元，空方伤心了！
     * 油价上涨10.0元，多方高兴了！
     * 油价下跌8.0元，空方高兴了！
     * 油价下跌8.0元，多方伤心了！
     */
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear(); //空方
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}

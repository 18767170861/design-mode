package org.wmc.behavior.observer.rate;

/**
 * 具体目标：人民币汇率
 */
public class RMBrate extends Rate {

    public void change(int number) {
        for (Company obs : companys) {
            ((Company) obs).response(number);
        }
    }
}

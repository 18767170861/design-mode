package org.wmc.behavior.observer.rate;

/**
 * 客户类
 */
public class RMBrateMain {

    /**
     * 人民币汇率升值10个基点，降低了进口产品成本，提升了进口公司利润率。
     * 人民币汇率升值10个基点，降低了出口产品收入，降低了出口公司的销售利润率。
     * 人民币汇率贬值9个基点，提升了进口产品成本，降低了进口公司利润率。
     * 人民币汇率贬值9个基点，提升了出口产品收入，提升了出口公司的销售利润率。
     */
    public static void main(String[] args) {
        Rate rate = new RMBrate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        rate.change(-9);
    }
}

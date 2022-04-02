package org.wmc.structure.composite.shop;

/**
 * 客户角色
 */
public class ShoppingMain {

    /**
     * 您选购的商品有：
     * 李宁牌运动鞋(数量：1，单价：198.0元)
     * 韶关香菇(数量：2，单价：68.0元)
     * 韶关红茶(数量：3，单价：180.0元)
     * 景德镇瓷器(数量：1，单价：380.0元)
     * 婺源特产(数量：2，单价：7.9元)
     * 婺源地图(数量：1，单价：9.9元)
     * 要支付的总价是：1279.7元
     */
    public static void main(String[] args) {
        float s = 0;
        Bags BigBag, mediumBag, smallRedBag, smallWhiteBag;
        Goods sp;
        BigBag = new Bags("大袋子");
        mediumBag = new Bags("中袋子");
        smallRedBag = new Bags("红色小袋子");
        smallWhiteBag = new Bags("白色小袋子");
        sp = new Goods("婺源特产", 2, 7.9f);
        smallRedBag.add(sp);
        sp = new Goods("婺源地图", 1, 9.9f);
        smallRedBag.add(sp);
        sp = new Goods("韶关香菇", 2, 68);
        smallWhiteBag.add(sp);
        sp = new Goods("韶关红茶", 3, 180);
        smallWhiteBag.add(sp);
        sp = new Goods("景德镇瓷器", 1, 380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);
        sp = new Goods("李宁牌运动鞋", 1, 198);
        BigBag.add(sp);
        BigBag.add(smallWhiteBag);
        BigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        BigBag.show();
        s = BigBag.calculation();
        System.out.println("要支付的总价是：" + s + "元");
    }
}

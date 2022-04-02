package org.wmc.create.factory.abstractFactory.farm;

public class FarmTest {
    /**
     * 类名：org.wmc.build.factory.abstractFactory.farm.SGfarm
     * 新牛出生！
     * 蔬菜长成！
     */
    public static void main(String[] args) {
        try {
            Farm f;
            Animal a;
            Plant p;
            f = (Farm) ReadXML.getObject();
            a = f.newAnimal();
            p = f.newPlant();
            a.show();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

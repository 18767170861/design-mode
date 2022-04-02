package org.wmc.create.builder.parlour;

/**
 * 用建造者（Builder）模式描述客厅装修。
 */
public class ParlourDecoratorMain {

    public static void main(String[] args) {
        try {
            Decorator d;
            d = (Decorator) ReadXML.getObject();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
package org.wmc.behavior.visitor;

/**
 * 客户类
 */
public class VisitorPatternMain {

    /**
     * 具体访问者A访问-->具体元素A的操作。
     * 具体访问者A访问-->具体元素B的操作。
     * ------------------------
     * 具体访问者B访问-->具体元素A的操作。
     * 具体访问者B访问-->具体元素B的操作。
     */
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}

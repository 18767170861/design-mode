package org.wmc.structure.composite.safe;

/**
 * 客户角色
 *   树枝构件类型为 Composite 类型，以便获取管理子类操作的方法
 */
public class SafeCompositePatternMain {
    /**
     * 树叶1：被访问！
     * 树叶2：被访问！
     * 树叶3：被访问！
     */
    public static void main(String[] args) {
        Composite c0 = new Composite();
        Composite c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}

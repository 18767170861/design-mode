package org.wmc.structure.facade;

/**
 * 客户角色
 */
public class FacadePatternMain {
    /**
     * 子系统01的method1()被调用！
     * 子系统02的method2()被调用！
     * 子系统03的method3()被调用！
     */
    public static void main(String[] args) {
        Facade f = new Facade();
        f.method();
    }
}

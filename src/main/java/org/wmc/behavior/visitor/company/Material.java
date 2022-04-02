package org.wmc.behavior.visitor.company;

/**
 * 抽象元素：材料
 */
public interface Material {

    String accept(Company visitor);
}

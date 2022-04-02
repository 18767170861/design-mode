package org.wmc.behavior.visitor.company;

/**
 * 具体元素：纸
 */
public class Paper implements Material {

    public String accept(Company visitor) {
        return (visitor.create(this));
    }
}

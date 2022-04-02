package org.wmc.behavior.visitor.company;

/**
 * 抽象访问者:公司
 */
public interface Company {

    String create(Paper element);

    String create(Cuprum element);

}

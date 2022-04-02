package org.wmc.behavior.mediator.estate;

/**
 * 抽象中介者：中介公司
 */
interface Medium {

    void register(Customer member); //客户注册

    void relay(String from, String ad); //转发
}

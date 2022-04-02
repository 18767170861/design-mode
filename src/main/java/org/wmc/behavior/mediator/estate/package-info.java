/**
 * 用中介者模式编写一个“韶关房地产交流平台”程序:
 *   说明：韶关房地产交流平台是“房地产中介公司”提供给“卖方客户”与“买方客户”进行信息交流的平台，比较适合用中介者模式来实现。
 *
 *   首先，定义一个中介公司（Medium）接口，它是抽象中介者，它包含了客户注册方法 register(Customer member) 和信息转发方法 relay(String from,String ad)；
 *   再定义一个韶关房地产中介（EstateMedium）公司，它是具体中介者类，它包含了保存客户信息的 List 对象，并实现了中介公司中的抽象方法。
 *
 *   然后，定义一个客户（Customer）类，它是抽象同事类，其中包含了中介者的对象，和发送信息的 send(String ad) 方法与接收信息的 receive(String from，String ad) 方法的接口，
 *   由于本程序是窗体程序，所以本类继承 JPmme 类，并实现动作事件的处理方法 actionPerformed(ActionEvent e)。
 *
 *   最后，定义卖方（Seller）类和买方（Buyer）类，它们是具体同事类，是客户（Customer）类的子类，它们实现了父类中的抽象方法，通过中介者类进行信息交流，
 *   其结构图如图 estate.jpg 所示。
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.wmc.behavior.mediator.estate;
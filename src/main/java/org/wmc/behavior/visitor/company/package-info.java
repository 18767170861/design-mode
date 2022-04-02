/**
 * 利用“访问者（Visitor）模式”模拟艺术公司与造币公司的功能:
 *   分析：艺术公司利用“铜”可以设计出铜像，利用“纸”可以画出图画；造币公司利用“铜”可以印出铜币，利用“纸”可以印出纸币。对“铜”和“纸”这两种元素，
 *   两个公司的处理方法不同，所以该实例用访问者模式来实现比较适合。
 *
 *   首先，定义一个公司（Company）接口，它是抽象访问者，提供了两个根据纸（Paper）或铜（Cuprum）这两种元素创建作品的方法；
 *   再定义艺术公司（ArtCompany）类和造币公司（Mint）类，它们是具体访问者，实现了父接口的方法。
 *
 *   然后，定义一个材料（Material）接口，它是抽象元素，提供了 accept（Company visitor）方法来接受访问者（Company）对象访问；
 *   再定义纸（Paper）类和铜（Cuprum）类，它们是具体元素类，实现了父接口中的方法。
 *
 *   最后，定义一个材料集（SetMaterial）类，它是对象结构角色，拥有保存所有元素的容器 List，并提供让访问者对象遍历容器中的所有元素的 accept（Company visitor）方法；
 *   客户类设计成窗体程序，它提供材料集（SetMaterial）对象供访问者（Company）对象访问，实现了 ItemListener 接口，处理用户的事件请求。
 *   图 company.jpg 所示是其结构图。
 *
 *
 */
package org.wmc.behavior.visitor.company;
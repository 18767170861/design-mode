/**
 * 用桥接（Bridge）模式模拟女士皮包的选购:
 *
 * 分析：女士皮包有很多种，可以按用途分、按皮质分、按品牌分、按颜色分、按大小分等，存在多个维度的变化，所以采用桥接模式来实现女士皮包的选购比较合适。
 *
 * 本实例按用途分可选钱包（Wallet）和挎包（HandBag），按颜色分可选黄色（Yellow）和红色（Red）。可以按两个维度定义为颜色类和包类。
 *
 * 颜色类（Color）是一个维度，定义为实现化角色，它有两个具体实现化角色：黄色和红色，通过 getColor() 方法可以选择颜色；
 * 包类（Bag）是另一个维度，定义为抽象化角色，它有两个扩展抽象化角色：挎包和钱包，它包含了颜色类对象，通过 getName() 方法可以选择相关颜色的挎包和钱包。
 *
 * 客户类通过 ReadXML 类从 XML 配置文件中获取包信息，并把选到的产品通过窗体显示出现，图 bag_structure.jpg 所示是其结构图。
 *
 */
package org.wmc.structure.bridge.bag;
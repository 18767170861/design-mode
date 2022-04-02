/**
 * 用工厂方法模式设计畜牧场。
 *   分析：有很多种类的畜牧场，如养马场用于养马，养牛场用于养牛，所以该实例用工厂方法模式比较适合。
 *
 *   对养马场和养牛场等具体工厂类，只要定义一个生成动物的方法 newAnimal() 即可。
 *   由于要显示马类和牛类等具体产品类的图像，所以它们的构造函数中用到了 JPanel、JLabd 和 ImageIcon 等组件，并定义一个 show() 方法来显示它们。
 *
 *   客户端程序通过对象生成器类 ReadXML2 读取 XML 配置文件中的数据来决定养马还是养牛。其结构图如图 animal.jpg 所示。
 */
package org.wmc.create.factory.factoryMethod.animal;
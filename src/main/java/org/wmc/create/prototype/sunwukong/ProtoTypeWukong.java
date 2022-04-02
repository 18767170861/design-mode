package org.wmc.create.prototype.sunwukong;

import javax.swing.*;
import java.awt.*;

/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: ProtoTypeWukong
 * Author: 86187
 * Date: 2021/12/31 0:29
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public class ProtoTypeWukong {

    public static void main(String[] args) {
        JFrame jf = new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        SunWukong obj1 = new SunWukong();
        contentPane.add(obj1);
        SunWukong obj2 = (SunWukong) obj1.clone();
        contentPane.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

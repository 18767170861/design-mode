package org.wmc.create.factory.factoryMethod.bicycle;

import javax.swing.*;
import java.awt.*;

/**
 * 具体产品：雅迪自行车
 */
public class YadeaBicycle implements Bicycle {
    JScrollPane sp;
    JFrame jf = new JFrame("工厂方法模式测试");
    public YadeaBicycle() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("雅迪自行车"));
        JLabel l1 = new JLabel(new ImageIcon("D:\\Idea Project\\design-mode\\src\\main\\resources\\img\\YadeaBicycle.jpg"));
        p1.add(l1);
        Container contentPane = jf.getContentPane();
        sp = new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //用户点击窗口关闭
    }
    public void show() {
        jf.setVisible(true);
    }
}
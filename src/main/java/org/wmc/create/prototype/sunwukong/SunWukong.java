package org.wmc.create.prototype.sunwukong;

import javax.swing.*;

public class SunWukong extends JPanel implements Cloneable {
    private static final long serialVersionUID = 5543049531872119328L;
    public SunWukong() {
        JLabel l1 = new JLabel(new ImageIcon("D:\\Idea Project\\design-mode\\src\\main\\resources\\img\\Wukong.jpg"));
        this.add(l1);
    }
    public Object clone() {
        SunWukong w = null;
        try {
            w = (SunWukong) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝悟空失败!");
        }
        return w;
    }
}

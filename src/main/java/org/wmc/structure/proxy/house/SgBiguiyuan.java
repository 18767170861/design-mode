package org.wmc.structure.proxy.house;

import javax.swing.*;
import java.awt.*;

/**
 * 真实主题：韶关碧桂园
 */
public class SgBiguiyuan extends JFrame implements HouseOwner {

    private static final long serialVersionUID = 1L;

    public SgBiguiyuan() {
        super("房产中介代售韶关碧桂园房子");
    }

    public void display() {
        this.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel(new ImageIcon("D:\\Idea Project\\design-mode\\src\\main\\java\\org\\wmc\\structure\\house\\SgBiguiyuan.jpg"));
        this.add(l1);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
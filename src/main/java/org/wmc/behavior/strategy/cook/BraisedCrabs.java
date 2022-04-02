package org.wmc.behavior.strategy.cook;

import javax.swing.*;

/**
 * 具体策略类：红烧大闸蟹
 */
public class BraisedCrabs extends JLabel implements CrabCooking {

    private static final long serialVersionUID = 1L;

    public void CookingMethod() {
        this.setIcon(new ImageIcon("D:\\Idea Project\\design-mode\\src\\main\\java\\org\\wmc\\behavior\\strategy\\cook\\BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}

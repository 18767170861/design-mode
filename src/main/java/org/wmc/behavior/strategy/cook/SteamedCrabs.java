package org.wmc.behavior.strategy.cook;

import javax.swing.*;

/**
 * 具体策略类：清蒸大闸蟹
 */
public class SteamedCrabs extends JLabel implements CrabCooking {

    private static final long serialVersionUID = 1L;

    public void CookingMethod() {
        this.setIcon(new ImageIcon("D:\\Idea Project\\design-mode\\src\\main\\java\\org\\wmc\\behavior\\strategy\\cook\\SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
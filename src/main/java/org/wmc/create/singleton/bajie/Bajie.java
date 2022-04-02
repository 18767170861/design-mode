package org.wmc.create.singleton.bajie;

import javax.swing.*;

/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Bajie
 * Author: 86187
 * Date: 2021/12/31 0:44
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public class Bajie extends JPanel {
    private static Bajie instance = new Bajie();
    private Bajie() {
        JLabel l1 = new JLabel(new ImageIcon("D:\\Idea Project\\design-mode\\src\\main\\resources\\img\\Bajie.jpg"));
        this.add(l1);
    }
    public static Bajie getInstance() {
        return instance;
    }
}

package org.wmc.command.breakfast.receive;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 接收者：馄饨厨师是命令的接收者
 */
public class HunTunChef extends JFrame {

  private static final long serialVersionUID = 1L;
  JLabel l = new JLabel();

  public HunTunChef() {
    super("煮馄饨");
    l.setIcon(new ImageIcon("D:\\idea project\\design-mode\\src\\main\\resources\\img\\HunTun.jpg"));
    this.add(l);
    this.setLocation(350, 50);
    this.pack();
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void cooking() {
    this.setVisible(true);
  }
}

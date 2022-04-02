package org.wmc.command.breakfast.receive;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 接收者：河粉厨师是命令的接收者
 */
public class HeFenChef extends JFrame {

  private static final long serialVersionUID = 1L;
  JLabel l = new JLabel();

  public HeFenChef() {
    super("煮河粉");
    l.setIcon(new ImageIcon("D:\\idea project\\design-mode\\src\\main\\resources\\img\\HeFen.jpg"));
    this.add(l);
    this.setLocation(200, 280);
    this.pack();
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void cooking() {
    this.setVisible(true);
  }
}

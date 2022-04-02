package org.wmc.command.breakfast.receive;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.wmc.command.breakfast.impl.ChangFen;

/**
 * 接收者：肠粉厨师是命令的接收者
 */
public class ChangFenChef extends JFrame {

  private static final long serialVersionUID = 1L;
  JLabel l = new JLabel();

  public ChangFenChef() {
    super("煮肠粉");
    l.setIcon(new ImageIcon("D:\\idea project\\design-mode\\src\\main\\resources\\img\\ChangFen.jpg"));
    this.add(l);
    this.setLocation(30, 30);
    this.pack();
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void cooking() {
    this.setVisible(true);
  }
}

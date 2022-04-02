package org.wmc.command.breakfast.impl;

import org.wmc.command.breakfast.Breakfast;
import org.wmc.command.breakfast.receive.HeFenChef;

/**
 * 具体命令：河粉，它们是具体命令类，实现早餐类的 cooking() 方法，但它们不会具体做，而是交给具体的厨师去做；
 */
public class HeFen implements Breakfast {

  private HeFenChef receiver;

  public HeFen() {
    receiver = new HeFenChef ();
  }

  @Override
  public void cooking() {
    receiver.cooking();
  }
}

package org.wmc.command.breakfast.impl;

import org.wmc.command.breakfast.Breakfast;
import org.wmc.command.breakfast.receive.HunTunChef;

/**
 * 具体命令：馄饨，它们是具体命令类，实现早餐类的 cooking() 方法，但它们不会具体做，而是交给具体的厨师去做；
 */
public class HunTun implements Breakfast {

  private HunTunChef receiver;

  public HunTun() {
    receiver = new HunTunChef();
  }

  @Override
  public void cooking() {
    receiver.cooking();
  }
}

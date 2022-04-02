package org.wmc.command.simple.commandimpl;

import org.wmc.command.simple.Command;
import org.wmc.command.simple.receive.Receiver;

/**
 * 具体命令类（Concrete Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 */
public class ConcreteCommand implements Command {

  private Receiver receiver;

  public ConcreteCommand() {
    receiver = new Receiver();
  }

  @Override
  public void execute() {
    receiver.action();
  }
}

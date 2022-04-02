package org.wmc.command.composite.commandimpl;

import org.wmc.command.composite.AbstractCommand;
import org.wmc.command.composite.receive.CompositeReceiver;

/**
 * 树叶构件: 具体命令2
 */
public class ConcreteCommand2 implements AbstractCommand {

  private CompositeReceiver receiver;

  public ConcreteCommand2() {
    receiver = new CompositeReceiver();
  }

  public void execute() {
    receiver.action2();
  }
}

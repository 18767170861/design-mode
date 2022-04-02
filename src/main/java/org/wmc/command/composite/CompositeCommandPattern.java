package org.wmc.command.composite;

import org.wmc.command.composite.commandimpl.ConcreteCommand1;
import org.wmc.command.composite.commandimpl.ConcreteCommand2;

/**
 * 命令模式的扩展:组合命令模式 在软件开发中，有时将命令模式与前面学的组合模式联合使用，这就构成了宏命令模式，也叫组合命令模式。 宏命令包含了一组命令，它充当了具体命令与调用者的双重角色，执行它时将递归调用它所包含的所有命令
 */
public class CompositeCommandPattern {

  /**
   * 客户访问调用者的execute()方法...
   * 接收者的action1()方法被调用...
   * 接收者的action2()方法被调用...
   * @param args
   */
  public static void main(String[] args) {
    AbstractCommand cmd1 = new ConcreteCommand1();
    AbstractCommand cmd2 = new ConcreteCommand2();
    CompositeInvoker ir = new CompositeInvoker();
    ir.add(cmd1);
    ir.add(cmd2);
    System.out.println("客户访问调用者的execute()方法...");
    ir.execute();
  }
}

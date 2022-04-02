package org.wmc.command.simple;

/**
 * 调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。
 */
public class Invoker {

  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void call(){
    System.out.println("调用者执行命令command...");
    command.execute();
  }
}

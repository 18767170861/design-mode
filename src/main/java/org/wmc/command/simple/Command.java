package org.wmc.command.simple;

/**
 * 抽象命令类（Command）角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()。
 */
public interface Command {
  void execute();
}

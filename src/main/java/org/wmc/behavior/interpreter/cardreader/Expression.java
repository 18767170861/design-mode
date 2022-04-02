package org.wmc.behavior.interpreter.cardreader;

/**
 * 抽象表达式类
 */
public interface Expression {

  boolean interpret(String info);
}

package org.wmc.behavior.interpreter.cardreader;

/**
 * 文法规则
 * <expression> ::= <city>的<person>
 * <city> ::= 韶关|广州
 * <person> ::= 老人|妇女|儿童
 */
public class InterpreterPatternMain {

  /**
   * 您是韶关的老人，您本次乘车免费！
   * 韶关的年轻人，您不是免费人员，本次乘车扣费2元！
   * 您是广州的妇女，您本次乘车免费！
   * 您是广州的儿童，您本次乘车免费！
   * 山东的儿童，您不是免费人员，本次乘车扣费2元！
   */
  public static void main(String[] args) {
    Context bus = new Context();
    bus.freeRide("韶关的老人");
    bus.freeRide("韶关的年轻人");
    bus.freeRide("广州的妇女");
    bus.freeRide("广州的儿童");
    bus.freeRide("山东的儿童");
  }

}

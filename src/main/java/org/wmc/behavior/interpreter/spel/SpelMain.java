package org.wmc.behavior.interpreter.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelMain {

  public static void main(String[] args) {
    ExpressionParser parser = new SpelExpressionParser();
    Integer value = parser.parseExpression("(1 + 1) * 33").getValue(Integer.class);
    System.out.println("value:" + value); //value:66

  }
}

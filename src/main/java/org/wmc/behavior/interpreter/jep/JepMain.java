package org.wmc.behavior.interpreter.jep;

import org.nfunk.jep.JEP;

public class JepMain {

  public static void main(String[] args) {
    JEP jep = new JEP();
    //定义要计算的数据表达式
    String 存款利息 = "本金*利率*时间";
    //给相关变量赋值
    jep.addVariable("本金", 10000);
    jep.addVariable("利率", 0.038);
    jep.addVariable("时间", 2);
    jep.parseExpression(存款利息);    //解析表达式
    Object accrual = jep.getValueAsObject();    //计算
    System.out.println("存款利息：" + accrual); //存款利息：760.0


    JEP jep1 = new JEP(); //一个数学表达式
    String exp = "((a+b)*(c+b))/(c+a)/b"; //给变量赋值
    jep1.addVariable("a", 10);
    jep1.addVariable("b", 10);
    jep1.addVariable("c", 10);
    try { //执行
      jep1.parseExpression(exp);
      Object result = jep1.getValueAsObject();
      System.out.println("计算结果： " + result); //计算结果： 2.0
    } catch (Throwable e) {
      System.out.println("An error occured: " + e.getMessage());
    }
  }

}

package org.wmc.create.prototype.extend;

import java.util.Scanner;

/**
 * 具体原型
 */
public class Square implements Shape {

  public Object clone() {
    Square b = null;
    try {
      b = (Square) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("拷贝正方形失败!");
    }
    return b;
  }

  public void countArea() {
    int a = 0;
    System.out.print("这是一个正方形，请输入它的边长：");
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    System.out.println("该正方形的面积=" + a * a + "\n");
  }
}

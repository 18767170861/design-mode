package org.wmc.structure.decorator.role;

/**
 * 具体装饰角色：少女
 */
public class Girl extends Changer {

  public Girl(Morrigan m) {
    super(m);
  }

  public void display() {
    setChanger();
    super.display();
  }

  public void setChanger() {
    ((original) super.m).setImage("Morrigan2.jpg");
  }
}

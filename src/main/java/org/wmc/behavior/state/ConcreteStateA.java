package org.wmc.behavior.state;

/**
 * 具体状态A类
 */
public class ConcreteStateA extends State {

    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}

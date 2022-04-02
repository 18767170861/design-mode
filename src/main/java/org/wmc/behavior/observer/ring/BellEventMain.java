package org.wmc.behavior.observer.ring;

/**
 * 客户类
 */
public class BellEventMain {

    /**
     * 上课铃响！
     * 老师上课了...
     * 同学们，上课了...
     * ------------
     * 下课铃响！
     * 老师下课了...
     * 同学们，下课了...
     */
    public static void main(String[] args) {
        BellEventSource bell = new BellEventSource();    //铃（事件源）
        bell.addPersonListener(new TeachEventListener()); //注册监听器（老师）
        bell.addPersonListener(new StuEventListener());    //注册监听器（学生）
        bell.ring(true);   //打上课铃声
        System.out.println("------------");
        bell.ring(false);  //打下课铃声
    }
}

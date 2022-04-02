package org.wmc.behavior.state;

/**
 * 客户类
 */
public class StatePatternClientMain {

    /**
     * 当前状态是 A.
     * 当前状态是 B.
     * 当前状态是 A.
     * 当前状态是 B.
     */
    public static void main(String[] args) {
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}

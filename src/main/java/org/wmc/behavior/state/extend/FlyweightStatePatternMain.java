package org.wmc.behavior.state.extend;

/**
 * 客户类
 */
public class FlyweightStatePatternMain {

    /**
     * 当前状态是： 状态1
     * 当前状态是： 状态2
     * 当前状态是： 状态1
     * 当前状态是： 状态2
     */
    public static void main(String[] args) {
        ShareContext context = new ShareContext(); //创建环境
        context.Handle(); //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}

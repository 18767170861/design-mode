package org.wmc.behavior.state.thread;

/**
 * 客户类
 */
public class ScoreStateMain {

    /**
     * 当前线程处于：新建状态.
     * 调用start()方法-->当前线程处于：就绪状态.
     * 获得CPU时间-->当前线程处于：运行状态.
     * 调用suspend()方法-->当前线程处于：阻塞状态.
     * 调用resume()方法-->当前线程处于：就绪状态.
     * 获得CPU时间-->当前线程处于：运行状态.
     * 调用stop()方法-->当前线程处于：死亡状态.
     */
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}

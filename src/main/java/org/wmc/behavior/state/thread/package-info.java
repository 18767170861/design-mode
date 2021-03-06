/**
 * 用“状态模式”设计一个多线程的状态转换程序:
 *   分析：多线程存在 5 种状态，分别为新建状态、就绪状态、运行状态、阻塞状态和死亡状态，各个状态当遇到相关方法调用或事件触发时会转换到其他状态，
 *   其状态转换规律如图 thread_state.jpg 所示。
 *
 * 现在先定义一个抽象状态类（TheadState），然后为图 3 所示的每个状态设计一个具体状态类，
 * 它们是新建状态（New）、就绪状态（Runnable ）、运行状态（Running）、阻塞状态（Blocked）和死亡状态（Dead），
 * 每个状态中有触发它们转变状态的方法，环境类（ThreadContext）中先生成一个初始状态（New），并提供相关触发方法，图 thread_structure.jpg 所示是线程状态转换程序的结构图。
 *
 *
 */
package org.wmc.behavior.state.thread;
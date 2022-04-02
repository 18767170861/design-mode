package org.wmc.create.builder.jdk8builder;

/**
 * 2 参数 Consumer
 */
@FunctionalInterface
public interface Consumer2<T, P1, P2> {

    void accept(T t, P1 p1, P2 p2);
}

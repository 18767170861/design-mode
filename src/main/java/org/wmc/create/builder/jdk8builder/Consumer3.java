package org.wmc.create.builder.jdk8builder;

/**
 * 3 参数 Consumer
 */
@FunctionalInterface
public interface Consumer3<T, P1, P2, P3> {

    void accept(T t, P1 p1, P2 p2, P3 p3);
}

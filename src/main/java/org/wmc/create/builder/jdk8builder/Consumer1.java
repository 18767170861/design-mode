package org.wmc.create.builder.jdk8builder;

/**
 * 1 参数 Consumer
 */
@FunctionalInterface
public interface Consumer1<T, P1> {

    void accept(T t, P1 p1);
}

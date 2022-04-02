package org.wmc.structure.proxy;

public class ProxyTest {

    /**
     * 访问真实主题之前的预处理。
     * 访问真实主题方法...
     * 访问真实主题之后的后续处理。
     */
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }

}

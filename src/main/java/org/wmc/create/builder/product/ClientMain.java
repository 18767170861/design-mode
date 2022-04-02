package org.wmc.create.builder.product;

public class ClientMain {
    /**
     * partA = 建造 PartA
     * partB = 建造 PartB
     * partC = 建造 PartC
     */
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}

package org.wmc.create.factory.factoryMethod.bicycle;

public class BicycleFactoryMain {

    public static void main(String[] args) {
        try {
            Bicycle a;
            BicycleFactory bf;
            bf = (BicycleFactory) ReadXML.getObject();
            a = bf.produce();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

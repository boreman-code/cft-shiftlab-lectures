package creational.factoryabstract;

import creational.factoryabstract.factory.AbstractFactory;
import creational.factoryabstract.product.ProductA;
import creational.factoryabstract.product.ProductB;

public class App {

    private ProductA productA;
    private ProductB productB;

    public App(AbstractFactory abstractFactory) {
        productA = abstractFactory.createProductA();
        productB = abstractFactory.createProductB();
    }

    public void doSomething() {
        // Бизнес-логика
    }
}

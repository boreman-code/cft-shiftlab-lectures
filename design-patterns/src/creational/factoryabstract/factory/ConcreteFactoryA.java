package creational.factoryabstract.factory;

import creational.factoryabstract.product.ConcreteProductA1;
import creational.factoryabstract.product.ConcreteProductB1;
import creational.factoryabstract.product.ProductA;
import creational.factoryabstract.product.ProductB;

public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

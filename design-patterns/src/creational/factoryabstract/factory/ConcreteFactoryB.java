package creational.factoryabstract.factory;

import creational.factoryabstract.product.ConcreteProductA2;
import creational.factoryabstract.product.ConcreteProductB2;
import creational.factoryabstract.product.ProductA;
import creational.factoryabstract.product.ProductB;

public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

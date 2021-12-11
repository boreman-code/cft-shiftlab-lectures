package creational.factorymethod.creator;

import creational.factorymethod.product.ConcreteProductA;
import creational.factorymethod.product.Product;

public class ConcreteCreatorA extends Creator {

    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}

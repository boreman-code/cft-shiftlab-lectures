package creational.factorymethod.creator;

import creational.factorymethod.product.ConcreteProductB;
import creational.factorymethod.product.Product;

public class ConcreteCreatorB extends Creator {

    @Override
    Product createProduct() {
        return new ConcreteProductB();
    }
}

package creational.factorymethod.creator;

import creational.factorymethod.product.Product;

public abstract class Creator {

    abstract Product createProduct();

    public void someAction() {

        // Какой-то код

        Product product = createProduct();

        product.doSomething();
    }
}

package creational.factoryabstract.factory;

import creational.factoryabstract.product.ProductA;
import creational.factoryabstract.product.ProductB;

public interface AbstractFactory {

    ProductA createProductA();

    ProductB createProductB();
}

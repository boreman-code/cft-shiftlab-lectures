package creational.factoryabstract;

import creational.factoryabstract.factory.AbstractFactory;
import creational.factoryabstract.factory.ConcreteFactoryA;
import creational.factoryabstract.factory.ConcreteFactoryB;

public class Client {
    private static AbstractFactory creator;

    public static void main(String[] args) {
        App app = config();

        app.doSomething();
    }

    public static App config() {
        App app;
        AbstractFactory abstractFactory;

        if (true) {
            abstractFactory = new ConcreteFactoryA();
            app = new App(abstractFactory);
        } else if (false) {
            abstractFactory = new ConcreteFactoryB();
            app = new App(abstractFactory);
        }

        return app;
    }
}

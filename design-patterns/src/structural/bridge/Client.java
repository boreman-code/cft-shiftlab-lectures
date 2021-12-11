package structural.bridge;

import structural.bridge.abstraction.Abstraction;
import structural.bridge.abstraction.RefinedAbstraction;
import structural.bridge.implementor.ConcreteImplementor;
import structural.bridge.implementor.Implementor;

public class Client {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction(implementor);

        String action = abstraction.doAction();

        System.out.println(action);
    }
}

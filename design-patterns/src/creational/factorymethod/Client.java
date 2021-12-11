package creational.factorymethod;

import creational.factorymethod.creator.ConcreteCreatorA;
import creational.factorymethod.creator.ConcreteCreatorB;
import creational.factorymethod.creator.Creator;

public class Client {
    private static Creator creator;

    public static void main(String[] args) {
        if (true) {
            creator = new ConcreteCreatorA();
        } else if (false) {
            creator = new ConcreteCreatorB();
        }
    }

    public static void runBusinessLogic() {

        // Остальная бизнес-логика

        creator.someAction();
    }
}

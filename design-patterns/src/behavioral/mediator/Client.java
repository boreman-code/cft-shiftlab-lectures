package behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Component componentA = new ConcreteComponent(mediator, "A");
        Component componentB = new ConcreteComponent(mediator, "B");
        Component componentC = new ConcreteComponent(mediator, "C");

        mediator.add(componentA);
        mediator.add(componentB);
        mediator.add(componentC);
        mediator.delete(componentC);
    }
}

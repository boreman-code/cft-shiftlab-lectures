package structural.decorator;

public class Client {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent("name");

        System.out.println(component.doSomething());

        ConcreteDecorator decorator = new ConcreteDecorator(component);

        System.out.println(decorator.doSomething());
    }
}

package structural.decorator;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public String doSomething() {
        return doSomethingNew(super.doSomething());
    }

    private String doSomethingNew(String data) {
        // Новая логика
        return data + " + new data";
    }
}

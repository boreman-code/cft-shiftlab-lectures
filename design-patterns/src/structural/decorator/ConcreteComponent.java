package structural.decorator;

public class ConcreteComponent implements Component {

    private final String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public String doSomething() {
        return name;
    }
}

package structural.decorator;

public class Decorator implements Component {

    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String doSomething() {
        return component.doSomething();
    }
}

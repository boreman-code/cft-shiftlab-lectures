package structural.composite;

public class Leaf implements Component {

    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}

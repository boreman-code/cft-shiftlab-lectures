package structural.composite;

public class Client {

    public static void main(String[] args) {
        Composite composite = new Composite();

        composite.addLeaf(new Leaf("1"));
        composite.addLeaf(new Leaf("2"));
        composite.addLeaf(new Leaf("3"));

        composite.doSomething();

        composite.clearAll();
    }
}

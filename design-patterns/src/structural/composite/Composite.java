package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final List<Component> leaves = new ArrayList<>();

    public void addLeaf(Component leaf) {
        leaves.add(leaf);
    }

    public void removeLeaf(Component leaf) {
        leaves.remove(leaf);
    }

    public void clearAll() {
        leaves.clear();
    }

    @Override
    public void doSomething() {
        leaves.forEach(Component::doSomething);
    }
}

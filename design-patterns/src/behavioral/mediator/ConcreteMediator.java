package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        components.add(component);

        components.forEach(c -> c.receiveSubscribeNotification(component));
    }

    @Override
    public void delete(Component component) {
        components.remove(component);

        components.forEach(c -> c.receiveUnsubscribeNotification(component));

    }
}

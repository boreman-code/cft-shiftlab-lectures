package behavioral.mediator;

public abstract class Component {
    private Mediator mediator;
    private String name;

    public Component(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void receiveSubscribeNotification(Component component);
    public abstract void receiveUnsubscribeNotification(Component component);
}

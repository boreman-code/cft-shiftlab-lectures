package behavioral.mediator;

public class ConcreteComponent extends Component {

    public ConcreteComponent(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveSubscribeNotification(Component component) {
        // Какая-то логика
        System.out.println("Компонент добавлен " + component.getName());
    }

    @Override
    public void receiveUnsubscribeNotification(Component component) {
        // Какая-то логика
        System.out.println("Компонент удалён " + component.getName());
    }
}

package behavioral.observer;

public class Client {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        subject.add(new ConcreteObserver());
        subject.add(new ConcreteObserver());
        subject.add(new ConcreteObserver());

        subject.notifySubscribers();
    }
}

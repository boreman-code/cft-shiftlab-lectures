package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private final List<Observer> subscribers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(Observer::update);
    }
}

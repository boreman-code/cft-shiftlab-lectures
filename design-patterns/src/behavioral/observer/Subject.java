package behavioral.observer;

public interface Subject {
    void add(Observer observer);
    void delete(Observer observer);
    void notifySubscribers();
}

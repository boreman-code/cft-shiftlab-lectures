package structural.adapter;

public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);

        Target target = new Target();

        Service service = new Service();

        service.handleTarget(target);

        service.handleTarget(adapter);
    }
}

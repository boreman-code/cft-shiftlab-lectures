package creational.prototype;

public class Client {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.a = 1;
        prototype.b = 2;
        prototype.c = 2;

        Prototype clone = (ConcretePrototype) prototype.clone();

        System.out.printf("clone == prototype: %b", prototype.equals(clone));
    }
}

package creational.singleton;

public class Client {
    public static void main(String[] args) {
        // Первая инициализация синглтона
        Singleton singleton = Singleton.getInstance("First");
        System.out.println(singleton.getValue());

        // Вторая инициализация синглтона
        singleton = Singleton.getInstance("second");
        System.out.println(singleton.getValue());
    }
}

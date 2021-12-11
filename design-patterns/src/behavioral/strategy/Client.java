package behavioral.strategy;

public class Client {

    public static void main(String[] args) {

        Context context = new Context(new ConcreteStrategyA());
        context.getStrategy().doSomething();

        context.setStrategy(new ConcreteStrategyB());
        context.getStrategy().doSomething();
    }
}

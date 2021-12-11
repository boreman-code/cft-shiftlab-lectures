package structural.adapter;

public class Adapter extends Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double doSomething() {
        String stringResult = adaptee.doAnother();
        double doubleResult;

        try {
            doubleResult = Double.parseDouble(stringResult);
        } catch (NumberFormatException e) {
            return 0.0;
        }

        return doubleResult;
    }
}

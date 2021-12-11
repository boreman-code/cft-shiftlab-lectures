package structural.bridge.abstraction;

import structural.bridge.implementor.Implementor;

public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract public String doAction();
}

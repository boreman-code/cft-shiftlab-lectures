package structural.bridge.abstraction;

import structural.bridge.implementor.Implementor;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public String doAction() {
        return "Action " + implementor.doSomething();
    }
}

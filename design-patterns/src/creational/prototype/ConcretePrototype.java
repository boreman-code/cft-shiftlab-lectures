package creational.prototype;

import java.util.Objects;

public class ConcretePrototype extends Prototype {

    public int c;

    public ConcretePrototype() {}

    public ConcretePrototype(ConcretePrototype target) {
        super(target);
        if (target != null) {
            this.c = target.c;
        }
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConcretePrototype that = (ConcretePrototype) o;
        return c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), c);
    }
}

package creational.prototype;

import java.util.Objects;

public abstract class Prototype {
    public int a;
    public int b;

    public Prototype() {}

    public Prototype(Prototype target) {
        if (target != null) {
            this.a = target.a;
            this.b = target.b;
        }
    }

    public abstract Prototype clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prototype prototype = (Prototype) o;
        return a == prototype.a && b == prototype.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

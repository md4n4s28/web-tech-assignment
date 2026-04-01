package constrained;

import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class Person {
    private int age;
    private final VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    public Person() {
        this.age = 18;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) throws PropertyVetoException {
        int oldAge = this.age;
        vcs.fireVetoableChange("age", oldAge, newAge);
        this.age = newAge;
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vcs.removeVetoableChangeListener(listener);
    }
}

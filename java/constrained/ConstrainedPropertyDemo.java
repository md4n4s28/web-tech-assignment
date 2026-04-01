package constrained;

import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class ConstrainedPropertyDemo {
    public static void main(String[] args) {
        Person person = new Person();

        VetoableChangeListener ageRule = event -> {
            if ("age".equals(event.getPropertyName())) {
                int newAge = (int) event.getNewValue();
                if (newAge < 18) {
                    throw new PropertyVetoException("Age cannot be less than 18.", event);
                }
            }
        };

        person.addVetoableChangeListener(ageRule);

        try {
            person.setAge(25);
            System.out.println("Age updated to: " + person.getAge());

            person.setAge(16);
            System.out.println("Age updated to: " + person.getAge());
        } catch (PropertyVetoException e) {
            System.out.println("Constrained property update blocked: " + e.getMessage());
        }
    }
}

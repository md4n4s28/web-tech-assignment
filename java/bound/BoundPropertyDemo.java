package bound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BoundPropertyDemo {
    public static void main(String[] args) {
        Person person = new Person();

        PropertyChangeListener listener = (PropertyChangeEvent event) ->
                System.out.println("Bound property changed: "
                        + event.getPropertyName()
                        + " from '" + event.getOldValue()
                        + "' to '" + event.getNewValue() + "'");

        person.addPropertyChangeListener(listener);
        person.setName("Ravi");
        person.setName("Rina");
    }
}

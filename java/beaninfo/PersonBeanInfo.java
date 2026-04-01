package beaninfo;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class PersonBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor name = new PropertyDescriptor("name", Person.class);
            PropertyDescriptor age = new PropertyDescriptor("age", Person.class);
            return new PropertyDescriptor[]{name, age};
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return new PropertyDescriptor[0];
        }
    }
}

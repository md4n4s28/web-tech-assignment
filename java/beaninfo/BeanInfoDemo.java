package beaninfo;

import java.beans.PropertyDescriptor;

public class BeanInfoDemo {
    public static void main(String[] args) {
        PersonBeanInfo beanInfo = new PersonBeanInfo();
        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

        System.out.println("BeanInfo demo (property descriptors):");
        for (PropertyDescriptor descriptor : descriptors) {
            System.out.println("- " + descriptor.getName() + " (type: " + descriptor.getPropertyType().getSimpleName() + ")");
        }
    }
}

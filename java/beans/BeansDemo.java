package beans;

public class BeansDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Asha");
        person.setAge(24);

        System.out.println("Simple JavaBean demo:");
        System.out.println(person);
    }
}

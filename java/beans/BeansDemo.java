package beans;

public class BeansDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Anas");
        person.setAge(22);

        System.out.println("Simple JavaBean demo:");
        System.out.println(person);
    }
}

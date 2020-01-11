package StreamAndMethodReference.ConstructorMethodReference;

public class Demo {

    public static void printName(String name, PersonBuilder bu) {
        Person person = bu.builderPerson(name);

        System.out.println(person.getName());
    }

    public static void main(String[] args) {

        printName("小雨", (name) -> new Person(name));
        printName("小明", Person::new);
    }
}

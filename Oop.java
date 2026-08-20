class Person {
    // Attributes
    String name;
    int age;

    Person(String n, int age) {
        this.name = n;
        this.age = age;
    }

    Person(String n) {
        this.name = n;
    }

    Person() {}

    // Behaviours
    public void talk() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

}

public class Oop {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Mary", 120),
            new Person("Ben", 1),
            new Person("John"),
            new Person()
        };

        for (Person person : people) {
            person.talk();
        }
    }
}

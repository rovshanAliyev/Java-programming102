package day43_list_custom_classes;

public class Person {
   // variables
    String firstname;
    int age;
    char gender;
    // behaviour
    public void speak() {
        System.out.println("Person is speaking");
    }

}
class People {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstname = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstname);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstname = "Sarah";
        person2.age = 24;
        person2.gender = 'F';
        person2.speak();

        System.out.println(person2.firstname);
        System.out.println(person2.age);
        System.out.println(person2.gender);

        System.out.println(person1.firstname);


    }
}

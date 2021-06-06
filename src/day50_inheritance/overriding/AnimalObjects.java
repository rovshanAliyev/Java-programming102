package day50_inheritance.overriding;

public class AnimalObjects {
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.name = "Gray";
    animal.type = "Husky";
    animal.speak();

    Cat cat = new Cat();
    cat.speak();
    cat.jump();

    Dog dog = new Dog();
    dog.speak();
    dog.run();

    }
}

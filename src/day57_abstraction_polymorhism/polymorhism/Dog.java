package day57_abstraction_polymorhism.polymorhism;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Dog is barking");
    }
}

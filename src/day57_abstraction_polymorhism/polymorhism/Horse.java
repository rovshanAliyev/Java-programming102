package day57_abstraction_polymorhism.polymorhism;

public class Horse extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("horse is saying neigh neigh");
    }
}

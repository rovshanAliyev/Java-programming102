package day57_abstraction_polymorhism.abstract_class_vs_interface;

public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    public AbstractA() {
        System.out.println("AbstractA constructor");
    }

    public abstract void absMethodA();
    public void methodB() {
        System.out.println("methodB called");
    }
    public static void staticMethod() {
        System.out.println("static method called");
    }
}

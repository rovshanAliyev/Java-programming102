package day57_abstraction_polymorhism.abstract_class_vs_interface;

public interface IntherfaceA {
    public static final String TYPE = "interface";
    double MAX_COUNT = 500;



    public abstract void absMethodD(int num);
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }

    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called");

    }
}

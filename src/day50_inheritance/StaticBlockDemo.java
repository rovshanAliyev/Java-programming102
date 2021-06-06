package day50_inheritance;

public class StaticBlockDemo {
    static int num;
    static {
        System.out.println("static initializer block");
        num = 10;
    }

    { //initializer block - runs each time created, before constructor
        System.out.println("Initializer block");

    }
    public StaticBlockDemo() {
        System.out.println("constructor method");
        num += 5;
    }

    public StaticBlockDemo(int value) {
        System.out.println("Overload constructor - value: " + value);
        num += value;

    }

    }

package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(3);
        int count = 55;
        displayValue(count);
        greetByName("Rovshan Aliyev");
        greetByName("Nadir");
        String name = "Suleman";
        greetByName(name);
    }
    public static void displayValue(int num) {
        System.out.println("value is: " + num);
    }
    public static void greetByName(String name) {
        System.out.println("Hello {" + name + "}, how are you today?");
    }
}

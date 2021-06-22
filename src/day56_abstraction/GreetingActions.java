package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {
        AzerbaijanLanguage az = new AzerbaijanLanguage();
        az.hi();
        az.bye();
        Greeting az2 = new AzerbaijanLanguage();
        az2.hi();
        az2.bye();
    }
}

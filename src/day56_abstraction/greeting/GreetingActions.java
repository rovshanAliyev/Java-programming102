package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        AzerbaijanLanguage az = new AzerbaijanLanguage();
        az.hi();
        az.bye();
        Greeting az2 = new AzerbaijanLanguage();
        az2.hi();
        az2.bye();

        RussianLanguage rl = new RussianLanguage();
        rl.hi();
        rl.bye();

        az2 = new RussianLanguage();
        az2.hi();
        az2.bye();
    }
}

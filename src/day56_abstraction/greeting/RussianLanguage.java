package day56_abstraction.greeting;

public class RussianLanguage implements Greeting {
    @Override
    public void hi() {
        System.out.println("Privet");
    }

    @Override
    public void bye() {
        System.out.println("Paka");
    }
}

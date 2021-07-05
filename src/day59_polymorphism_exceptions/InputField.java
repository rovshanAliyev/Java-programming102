package day59_polymorphism_exceptions;

public class InputField implements WebElement {
    public static final String TAG_NAME = "input";

    public String getValue() {
        System.out.println("Getting value in the inputField");
        return "selenium";
    }

    @Override
    public void sendKeys(String text) {
        System.out.println("Typing into input field - " + text );
    }

    @Override
    public void click() {
        System.out.println("Clicking on input field");
    }

    @Override
    public String getText() {
        System.out.println("getting text of input field");
        return "java";
    }
}
package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("Flying in auto-pilot");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one place to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 0.27) + " to drive " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Welcome to aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");
    }

    public void land() {
        System.out.println("Landing the plane.");
    }
}

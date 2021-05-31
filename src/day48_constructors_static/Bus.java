package day48_constructors_static;

public class Bus {
    Driver driver;
    Engine engine;

    @Override
    public String toString() {
        return driver.getName() + " | " + engine.getCylinders();
    }
}

package day56_abstraction.drivable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla modul3 = new Tesla();
        modul3.start();
        modul3.hi();
        modul3.transportPeople();
        modul3.autoPiloting();
        modul3.cost(25);
        modul3.stop();
        modul3.bye();

        Plane plane = new Plane();
        plane.hi();
        plane.start();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(250);
        plane.land();
        plane.stop();
        plane.bye();
    }
}

package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        Worker worker = new SuperMan();
        worker.work("PO");
        worker.getPaid();

        ((Father) worker).feedKid();
        ((SuperMan) worker).playWithKid();

        SuperMan superMan = (SuperMan) worker;
        superMan.playWithKid();




    }
}

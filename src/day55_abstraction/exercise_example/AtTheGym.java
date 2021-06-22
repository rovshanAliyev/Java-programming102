package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running(); // polymorphism benefit of abstraction.
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 mins - colories = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 mins - colories = " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Running 30 mins - colories = " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Running 30 mins - colories = " + freeWeight.getCaloriesCount(30));
    }
}

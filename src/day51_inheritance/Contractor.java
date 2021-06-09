package day51_inheritance;

public class Contractor extends Employee {
    String jobTitle;

    @Override
    public double calculateSalary(double hourlyRate) {
        return 50 * 40 * hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

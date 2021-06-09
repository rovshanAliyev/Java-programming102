package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(60);
        System.out.println("annualDevSalary = " + annualDevSalary);
        System.out.println("developer.toString() = " + developer.toString());

        Contractor sdetContractor = new Contractor();
        sdetContractor.jobTitle = "SDET";
        double sdetSalary = sdetContractor.calculateSalary(55);
        System.out.println("stedSalary = " + sdetSalary);
        System.out.println("sdetContractor.toString() = " + sdetContractor.toString());


    }
}

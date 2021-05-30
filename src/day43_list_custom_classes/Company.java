package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Rovshan Aliyev";
        emp1.jobTitle = "STED";
        emp1.work();
        System.out.println(emp1.name);
        System.out.println(emp1.jobTitle);

        Employee emp2 = new Employee();
        emp2.name = "Zahid Aliyev";
        emp2.jobTitle = "Developer";
        emp2.work();
        System.out.println(emp2.name);
        System.out.println(emp2.jobTitle);
    }
}

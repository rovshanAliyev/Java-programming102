package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student(); //runs no-args constructor
        Student st2 = new Student(); //runs no-args constructor

        Student st3 = new Student("Rovshan");
        Student st4 = new Student("Aliyev");

        Student st5 = new Student("Zahid" , 30);

    }
}

package day50_inheritance;

public class InheretanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 24;
        t1.talk();

        Student student = new Student();
        student.name = "Ali";
        student.age = 33;
        student.talk();
        student.walk();
        student.work("QA");
        student.school = "Cybertek";
        student.study("java programming inheritance");


    }
}

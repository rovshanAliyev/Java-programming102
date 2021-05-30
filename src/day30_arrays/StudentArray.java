package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = {"104", "Rovshan", "Aliyev", "22", "253-431-1143"};
        System.out.println("Student id number: " + student1[0]);
        System.out.println("Student first name: " + student1[1]);
        System.out.println("Student last name: " + student1[2]);
        System.out.println("Student batch number: " + student1[3]);
        System.out.println("Student phone number: " + student1[4]);
        System.out.println("student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("Pass: data array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        String phoneNum = student1[4];
        System.out.println(phoneNum);
    }
}

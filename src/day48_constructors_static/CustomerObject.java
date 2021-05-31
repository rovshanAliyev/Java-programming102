package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.setId(1);
        cs1.setName("Rovshan");
        System.out.println(cs1);

        Customer cs2 = new Customer("Aliyev", 20);
        System.out.println(cs2);

        // array of customer
        Customer[] todayCustomers = {cs1, cs2, new Customer("Bashir", 449)};

        //arraylist of customer object
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 756 ));

        System.out.println(todayCustomers[0]);
        System.out.println(customerList.get(0));
        System.out.println(customerList);

        System.out.println("for loops");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        System.out.println("each loop");
        for (Customer eachCustomer : customerList) {
            System.out.println(eachCustomer);
        }

        System.out.println("names of customer");
        for (Customer each : customerList) {
            System.out.println(each.getName());
        }




    }
}

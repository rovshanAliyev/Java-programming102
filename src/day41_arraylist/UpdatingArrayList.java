package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskivich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        System.out.println(myCars);
        
        String allCarsIn1St = myCars.toString();
        System.out.println("allCarsIn1St = " + allCarsIn1St);
        
        myCars.set(0, "lamborghini");
        System.out.println("myCars = " + myCars);

        System.out.println(myCars.indexOf("tesla"));

        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("myCars = " + myCars);

        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        } else {
            System.out.println("lada is not found");
        }

        System.out.println("myCars = " + myCars);

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("lamborghini")){
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i, "audi");
            }
        }
        System.out.println("after loop = " + myCars);



    }
}

package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer n = new Integer(500);
        System.out.println("is n 500 = " + n.equals(500));
        System.out.println(n + 200);

        Integer intObject = 1000;
        System.out.println(intObject / 50);
        
        String numStr = intObject+"";
        String numSt = intObject.toString();

        System.out.println("numStr = " + numStr);
        System.out.println("numSt = " + numSt);

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;

        Short sh1 = new Short((short) 40);
        Short sh2 = 50;

        Integer i1 = new Integer(1000);
        Integer i2 = 200;

        Long l1 = new Long(300l);
        Long l2 = 3455l;

        Float fl1 = new Float(5.2f);
        Float fl2 = 45.3f;

        Double d1 = new Double(345.3);
        Double d2 = 234.5;

        Character ch1 = new Character('Q');
        Character ch2 = 'V';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;





    }
}

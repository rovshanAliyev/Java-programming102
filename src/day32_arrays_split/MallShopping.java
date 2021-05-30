package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("-----------FIND THE INDEX OF 'Gloves' in items array------");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                System.out.println("Gloves found at the index of: " + i);
                break;
            }
        }

        System.out.println("-------Set boolean to true if first 'Ipad' is found");
        boolean ipadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")) {
                ipadExists = true;
                break;
            }
        }
        System.out.println("ipadExists = " + ipadExists);
        if (ipadExists) {
            System.out.println("we bought the ipad");
        } else {
            System.out.println("we forgot the ipad");
        }

        System.out.println("print a report of each shopping list");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" +itemIDs[i]);
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }
        }
    }
}
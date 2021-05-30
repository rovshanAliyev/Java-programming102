package officeHours.Practice1;

public class CypertekBatches {
    public static void main(String[] args) {
        String batchType = "US";

        if (batchType.equals("US") || batchType.equals("us")) {
            boolean isMorning = true;

            if (isMorning) {
                System.out.println("class time are 10-5");
            } else {
                System.out.println("class time are 7-10");
            }

        }else if (batchType.equals("EU") || batchType.equals("eu")) {

        }else {
            System.out.println("Invalid Batch type");
        }
    }
}

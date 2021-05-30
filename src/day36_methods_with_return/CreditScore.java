package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(78);

        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);
    }  public static int getCreditScore() {
        return 800;
    }

    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("you are eligible for leasing this car");
        } else {
            System.out.println("sorry, you are not eligible for leasing this car");
        }
    }

}

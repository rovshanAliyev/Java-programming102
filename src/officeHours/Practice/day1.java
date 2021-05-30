package officeHours.Practice;

public class day1 {
    public static void main(String[] args) {
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSibling;
        long favoriteNumbers;
        int numberOfSeasons, year;
        double birthDate;

        name = "Rovshan";
        age = 25;
        gender = 'M';
        student = true;
        numberOfSibling = 1;
        favoriteNumbers = 7;
        numberOfSeasons = 4;
        birthDate = 4.11;
        year = 1995;
        fullBirthDate = "" + birthDate + "." + year;
        favoriteQuote = "Have a good mindset";
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("student = " + student);
        System.out.println("favoriteNumbers = " + favoriteNumbers);
        System.out.println("favoriteQuote = " + favoriteQuote);
        System.out.println("numberOfSeasons = " + numberOfSeasons);
    }
}
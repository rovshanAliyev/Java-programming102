package day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Murodil");
        user1.setRole("Teacher");

        Admin admin1 = new Admin();
        admin1.setId(2345);
        admin1.setName("Burak");
        admin1.setRole("Studen");

        System.out.println(user1);
        System.out.println(admin1);


    }
}

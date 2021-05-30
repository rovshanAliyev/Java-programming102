package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Rovshan Aliyev", "Yahoo");
    }
    public static void buildEmail(String name, String domain) {
        String email = (name + "@" + domain + ".com").replace(" ","_").toLowerCase();
        System.out.println("Email is " + email);
    }
}

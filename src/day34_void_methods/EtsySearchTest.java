package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy search smoke test completed - Pass -");
    }
    public static void openBrowser() {
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("Navigatating to https://www.etsy.com/ ");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("Pass: Verify Etsy home page is displayed");
        System.out.println("type 'Wooden spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("Search: results are successfully displayed ");
    }
}

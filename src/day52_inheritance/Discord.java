package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someone) {
        System.out.println("Chatting with " + someone + " on Discord");
    }

    @Override
    protected boolean download() {
        System.out.println("Download Discord 0.0.23 from App Store");
        return true;

    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Rovshan");

    }

    public void printInfo() {
        System.out.println("App name = " + getName());
        System.out.println("App Version = " + getVersion());

    }


}

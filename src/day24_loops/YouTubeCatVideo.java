package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("Watching \uD83D\uDC08 video: second: " + seconds);
            seconds++;
            Thread.sleep(100);
        }

        System.out.println("Finished watching Cat video, lets start another one");
    }
}

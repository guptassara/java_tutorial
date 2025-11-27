import java.util.Scanner;

public class _23_for_countdown {

    public static void main(String[] args) throws InterruptedException {
        int start = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many seconds to count down from?");
        start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!!");
    }
}

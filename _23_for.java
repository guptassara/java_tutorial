import java.util.Scanner;

public class _23_for {

    public static void main(String[] args) {
        // for loop execute some code a CERTAIN amount of times
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many time do you wan to loop: ");
        int max = scanner.nextInt();
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
    }
}

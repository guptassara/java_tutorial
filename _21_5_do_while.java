import java.util.Scanner;

public class _21_5_do_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        // while (number < 1 || number > 10) {
        //     System.out.println("Enter a number between 1 to 10");
        //     number = scanner.nextInt();
        // }
        do {
            System.out.println("Enter a number between 1 to 10");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);
        System.out.println(number);
    }
}

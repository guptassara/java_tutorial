import java.util.Scanner;

public class _21_1_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        // if (name.isEmpty()) {
        //     System.out.println("Enter your name: ");
        //     name = scanner.nextLine();
        // }
        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("HEWWOO " + name);
        scanner.close();

        // Infinite loop
        // while (1 == 1) {
        //     System.out.println("HELP!!!!!");
        // }
    }
}

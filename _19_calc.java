import java.util.Scanner;

public class _19_calc {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double a,
            b,
            result = 0;
        int choice;
        String header =
            "==============================\n" +
            "|      Basic Calculator      |\n" +
            "|   +   -   *   /   %   ^    |\n" +
            "|   ( ) [ ] { } < > | & !    |\n" +
            "==============================\n";
        System.out.println(header);
        System.out.println(
            "Choose:(1/2/3/4/5):\n1. Addition \n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponential"
        );
        choice = scanner.nextInt();
        System.out.println("Enter 1st number: ");
        a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        b = scanner.nextInt();

        switch (choice) {
            case 1 -> result = a + b;
            case 2 -> result = a - b;
            case 3 -> result = a * b;
            case 4 -> {
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Cannot divide");
                }
            }
            case 5 -> result = Math.pow(a, b);
            default -> System.out.println("Choose correctly");
        }
        System.out.printf("Result is: %f", result);
        scanner.close();
    }
}

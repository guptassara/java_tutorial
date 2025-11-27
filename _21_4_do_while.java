import java.util.Scanner;

public class _21_4_do_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        // System.out.println("enter age ");
        // age = scanner.nextInt();

        do {
            System.out.println("Age can not be negative!!");
            System.out.println("enter age ");
            age = scanner.nextInt();
        } while (age < 0);
        System.out.println("Your age is: " + age);
        scanner.close();
    }
}

import java.util.Scanner;

public class _21_3_while_age {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("enter age ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Age can not be negative!!");
            System.out.println("enter age ");
            age = scanner.nextInt();
        }
        System.out.println("Your age is: " + age);
        scanner.close();
    }
}

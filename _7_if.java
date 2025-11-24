import java.util.Scanner;

public class _7_if {

    public static void main(String[] args) {
        String name;
        int age;
        boolean isStudent;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Enter age");
        age = scanner.nextInt();
        System.out.println("Are you student? (true/false)");
        isStudent = scanner.nextBoolean();

        if (name.isEmpty()) {
            System.out.println("You didn't enter you name");
        } else {
            System.out.println("Hello " + name);
        }

        if (age >= 65) {
            System.out.println("You are a senior");
        } else if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age < 18 && age > 0) {
            System.out.println("You are a minor");
        } else if (age == 0) {
            System.out.println("You are a baby");
        } else {
            System.out.println("Enter correct age");
        }
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }
        scanner.close();
    }
}

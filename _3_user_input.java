import java.util.Scanner;

public class _3_user_input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // String name = scanner.next();    //skips at space
        String full_name = scanner.nextLine();
        // System.out.println("Your name is " + name);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();
        System.out.print("Are you student? (true/false?): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println(
            "Your name is " +
                full_name +
                ". And you are " +
                age +
                " years old. " +
                "Your CGPA is " +
                cgpa +
                ". Student: " +
                isStudent
        );
        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        //COMMON ISSUES

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your favorite colour: ");
        String colour = sc.nextLine();

        System.out.println(
            "You are " + age2 + " years old. Your favorite colour is: " + colour
        );

        // scanner took \n from the first input hence added sc.nextLine();

        scanner.close();
    }
}

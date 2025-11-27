import java.util.Scanner;

public class _20_2_username_validate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = scanner.nextLine();
        if (username.isEmpty()) {
            System.out.println("Username must not be empty");
        } else if (username.length() < 4 || username.length() > 12) {
            System.out.println("username must be between 4 to 12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println(
                "Username must not contain spaces or underscores"
            );
        } else {
            System.out.println(username + " Welcome!!");
        }
        scanner.close();
    }
}

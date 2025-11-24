import java.util.Scanner;

public class _14_sub_string {

    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a String
        //                .substring(start, end)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scanner.nextLine();

        if (email.contains("@") && email.contains(".com")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"), email.length());

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Invalid email");
        }

        scanner.close();
    }
}

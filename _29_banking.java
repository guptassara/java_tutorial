import java.util.Scanner;

public class _29_banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double amount = 0;
        int choice;
        boolean isRunning = true;

        System.out.println(
            "╔══════════════════════════════════════════════════════╗"
        );
        System.out.println(
            "║                * BANKING PROGRAM *                   ║"
        );
        System.out.println(
            "╠══════════════════════════════════════════════════════╣"
        );
        System.out.println(
            "║  *************************************************   ║"
        );
        System.out.println(
            "║  *    Welcome to Secure Banking System v2.0     *    ║"
        );
        System.out.println(
            "║  *  Check Balance | Deposit | Withdraw | Exit   *    ║"
        );
        System.out.println(
            "║  *************************************************   ║"
        );
        System.out.println(
            "╚══════════════════════════════════════════════════════╝"
        );

        while (isRunning) {
            System.out.println(
                "Choose your option: \n1. Show balance\n2. Deposit\n3. Withdraw\n4. Exit"
            );
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(amount);
                case 2 -> amount += deposit();
                case 3 -> amount = amount - withdraw(amount);
                case 4 -> isRunning = false;
                default -> System.out.println("Enter a valid choice: ");
            }
        }
        System.out.println(
            "╔══════════════════════════════════════════════════════╗"
        );
        System.out.println(
            "║                   * THANK YOU *                      ║"
        );
        System.out.println(
            "╚══════════════════════════════════════════════════════╝"
        );
    }

    static void showBalance(double amount) {
        System.out.println(
            "************************************************* "
        );
        System.out.println("Your balance is: Rs." + amount);
        System.out.println(
            "************************************************* "
        );
    }

    static double deposit() {
        System.out.println(
            "************************************************* "
        );
        double depositAmt = 0;
        System.out.println("Enter the amount you want to deposit");
        depositAmt = scanner.nextDouble();

        if (depositAmt < 0) {
            System.out.println("Amount can not be negative!");
            return 0;
        } else {
            System.out.println(depositAmt + "Rs. Amount has been deposited");
            System.out.println(
                "************************************************* "
            );
            return depositAmt;
        }
    }

    static double withdraw(double amount) {
        double withdrawAmt = 0;
        System.out.println(
            "************************************************* "
        );
        System.out.println("Enter the amount you want to withdraw");
        withdrawAmt = scanner.nextDouble();
        if (withdrawAmt < 0) {
            System.out.println("Amount can not be negative");
            return 0;
        } else if (withdrawAmt > amount) {
            System.out.println("Not enough funds!");
            return 0;
        } else {
            System.out.println(withdrawAmt + "Rs. Amount has been withdrawn");
            System.out.println(
                "*************************************************"
            );
            return withdrawAmt;
        }
    }
}

import java.lang.Math;
import java.util.Scanner;

public class _11_compound_interest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = 0;
        double rate = 0;
        double time = 0;
        double amount = 0;
        double n = 0;
        double interest = 0;

        System.out.println("Enter principal");
        principal = scanner.nextDouble();
        System.out.println("Enter rate");
        rate = scanner.nextDouble();
        System.out.println("Enter time");
        time = scanner.nextDouble();
        System.out.println("Enter number of times to be compounded per year");
        n = scanner.nextDouble() / 100;
        amount = principal * Math.pow((1 + (rate / n)), (n * time));
        interest = amount - principal;
        System.out.printf(
            "The calculated amount if Rs.%f \nAnd compount interest is Rs.%f",
            amount,
            interest
        );

        scanner.close();
    }
}

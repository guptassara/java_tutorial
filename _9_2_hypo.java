import java.lang.Math;
import java.util.Scanner;

public class _9_2_hypo {

    public static void main(String[] args) {
        double height;
        double base;
        double hypotaneous;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height");
        height = scanner.nextInt();
        System.out.println("Enter base");
        base = scanner.nextInt();
        hypotaneous = Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
        System.out.println("Hypotaneous is " + hypotaneous);
    }
}

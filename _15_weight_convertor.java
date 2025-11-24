import java.util.Scanner;

/*
    Pounds to kilograms:
    kg=lb×0.45359237kg=lb×0.45359237

    Kilograms to pounds:
    lb=kg÷0.45359237lb=kg÷0.45359237
    or
    lb=kg×2.20462262lb=kg×2.20462262

*/
public class _15_weight_convertor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------WEIGHT CONVERTOR----------");
        System.out.println("Enter weight");
        double weight = scanner.nextDouble();
        System.out.println(
            "Choose option(1/2): \n1. lbs to kgs \n2. kgs to lbs"
        );
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println(
                "Converted weight is: " + weight * 0.45359237 + "kgs"
            );
        } else if (choice == 2) {
            System.out.println(
                "Converted weight is: " + weight / 0.45359237 + "lbs"
            );
        } else {
            System.out.println("Enter Valid input");
        }
        scanner.close();
    }
}

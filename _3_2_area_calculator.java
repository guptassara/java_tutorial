import java.lang.Math;
import java.util.Scanner;

public class _3_2_area_calculator {

    public static void main(String[] args) {
        double length = 0;
        double breadth = 0;
        double side = 0;
        double base = 0;
        double height = 0;
        double radius = 0;
        double area = 0;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print(
            "Choose the shape for area: \n1. Rectangle\n2. Square\n3. Triangle\n4. Circle\n"
        );
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You chose Rectangle");
            System.out.print("Enter length: ");
            length = scanner.nextDouble();
            System.out.print("Enter breadth: ");
            breadth = scanner.nextDouble();
            area = length * breadth;
            System.out.println("Area of Rectangle is = " + area);
        } else if (choice == 2) {
            System.out.println("You chose Square");
            System.out.print("Enter side: ");
            side = scanner.nextDouble();
            area = side * side;
            System.out.println("Area of Square is = " + area);
        } else if (choice == 3) {
            System.out.println("You chose Triangle");
            System.out.print("Enter height: ");
            height = scanner.nextDouble();
            System.out.print("Enter base: ");
            base = scanner.nextDouble();
            area = 0.5 * base * height;
            System.out.println("Area of Triangle is = " + area);
        } else if (choice == 4) {
            System.out.println("You chose Circle");
            System.out.print("Enter radius: ");
            radius = scanner.nextDouble();
            area = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of Circle is = " + area);
        } else {
            System.out.println("Bhakk");
        }

        scanner.close();
    }
}

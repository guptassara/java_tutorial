import java.lang.Math;
import java.util.Scanner;

public class _9_3_circle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumferenc;
        double area;
        double volume;

        System.out.println("Enter radius");
        radius = scanner.nextDouble();
        circumferenc = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("circumferenc is %.1f\n", circumferenc);
        System.out.printf("area is %.1f\n", area);
        System.out.printf("volume is %.1f", volume);
    }
}

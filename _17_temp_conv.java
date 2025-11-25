import java.util.Scanner;

public class _17_temp_conv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temparature: ");
        temp = scanner.nextDouble();
        System.out.println("convert to? C/F");
        unit = scanner.next().toUpperCase();

        System.out.println(temp);
        System.out.println(unit);

        newTemp = (unit.equals("C"))
            ? ((temp - 32) * 5) / 9
            : ((temp * 9) / 5) + 32;

        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();
    }
}

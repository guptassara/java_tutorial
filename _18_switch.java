import java.util.Scanner;

public class _18_switch {

    public static void main(String[] args) {
        // enhanced switch = A replacement to many else if statements
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        String day = scanner.next().toLowerCase();
        switch (day) {
            // case "monday" -> System.out.println("Weekday");
            // case "tuesday" -> System.out.println("Weekday");
            // case "wednesday" -> System.out.println("Weekday");
            // case "thursday" -> System.out.println("Weekday");
            // case "friday" -> System.out.println("Weekday");
            // case "saturday" -> System.out.println("Weekend");
            // case "sunday" -> System.out.println("Weekend");
            // default -> System.out.println("Wrong day");

            case
                "monday",
                "tuesday",
                "wednesday",
                "thursday",
                "friday" -> System.out.println("Weekday");
            case "saturday", "sunday" -> System.out.println("Weekend");
            default -> System.out.println("Wrong day");
        }
        scanner.close();
    }
}

import java.io.PrintStream;

public class _26_method {

    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called ()

        int age = 3;
        String name = "Mavuika";
        happyBirthday(age, name);
        happyBirthday(200, "Citlali");
        happyBirthday(25, "Nefer");
        double number = 22.9;
        System.out.println(square(number));
        System.out.println(cube(number));
        String fullname = getFullName("Spongebob", "Squarepants");
        System.out.println(fullname);
        if (ageCheck(age)) {
            System.out.println("Adult");
        } else {
            System.out.println("nopee");
        }
    }

    static void happyBirthday(int age, String name) {
        // int age = 10;
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.println(
            "Happy Birthday dear " +
                name +
                ", now you are " +
                age +
                " years old!"
        );
        System.out.println("Happy Birthday to you!");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        return (age >= 18) ? true : false;
    }
}

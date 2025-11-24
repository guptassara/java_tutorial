// ✓ variable = a reusable container for a value
//    a variable behaves as if it was the value it contains

// 🟥 Primitive = simple value stored directly in memory (stack)
// 🟦 Reference = memory address (stack) that points to the (heap)

// 🟥 Primitive vs 🟦 Reference
//    ---------          ---------
//    int                string
//    double             array
//    char               object
//    boolean

// 2 Steps to creating a variable
// -------------------------------
// 1. declaration
// 2. assignment

public class _2_variables {

    public static void main(String args[]) {
        System.out.println("Okay");
        int x = 0;
        System.out.println(x);
        int age = 20;
        System.out.println(age);
        int year = 2025;
        System.out.println("The year is " + year);

        float quantity = 1;
        System.out.println(quantity);

        double cgpa = 8.54;
        System.out.println(cgpa);
        double price = 9000000.88;
        System.out.println("₹" + price);

        char grade = 'A';
        System.out.println("Grade is: " + grade);
        char symbol = '₹';
        System.out.println(symbol);
        char emo = '!';
        System.out.println(emo);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        String name = "Blair Willows";
        String food = "Chocolate cake";
        String email = "BlairWillows@princess.com";
        String colour = "Pink";
        String car = "Princess cart";
        String currency = "\u20B9";
        System.out.println("Your name is " + name + ", and your favorite food is " + food);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your cgpa is " + cgpa);
        System.out.println("Your grade is " + grade);
        System.out.println("Your email is " + email);
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        System.out.println("Your choice is a " + colour + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);
        if (forSale) {
            System.out.println(car + " is for sale");
        } else {
            System.out.println(car + " is not for sale");
        }

    }
}

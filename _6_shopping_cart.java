import java.util.Scanner;

public class _6_shopping_cart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu =
            "pizza, burger, pasta, sandwich, salad, sushi, soup, taco, noodles, curry";
        String item;
        double price;
        int quantity;
        char currency = '₹';
        double total;

        System.out.println(menu);
        System.out.println("What would you like to buy?");
        item = scanner.nextLine();
        System.out.println("How many would you like to buy?");
        quantity = scanner.nextInt();
        System.out.println("What is the price for one?");
        price = scanner.nextDouble();
        total = price * quantity;

        System.out.println(
            "You bought " +
                quantity +
                item +
                "(s). the price for each is " +
                currency +
                price +
                ". Your total will be " +
                currency +
                total
        );

        scanner.close();
    }
}

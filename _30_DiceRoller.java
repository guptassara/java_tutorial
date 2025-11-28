import java.util.Random;
import java.util.Scanner;

public class _30_DiceRoller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = 0;
        int c = 0;
        int total = 0;

        // System.out.println(dice1);
        // System.out.println(dice2);
        // System.out.println(dice3);
        // System.out.println(dice4);
        // System.out.println(dice5);
        // System.out.println(dice6);
        //
        System.out.println("How many times do you want to roll the dice? ");
        num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Can not be negative or zero!");
        } else {
            System.out.println("you chose " + num);
            for (int i = 0; i < num; i++) {
                c = random.nextInt(1, 7);
                System.out.print(c + "\n");
                printDie(c);
                total += c;
            }
        }
        System.out.println("\nYour total is: " + total);
    }

    static void printDie(int c) {
        switch (c) {
            case 1 -> System.out.println(
                    "┌─────────┐\n" +
                    "│         │\n" +
                    "│    *    │\n" +
                    "│         │\n" +
                    "└─────────┘");
            case 2 -> System.out.println(
                    "┌─────────┐\n" +
                    "│ *       │\n" +
                    "│         │\n" +
                    "│       * │\n" +
                    "└─────────┘");
            case 3 -> System.out.println(
                    "┌─────────┐\n" +
                    "│ *       │\n" +
                    "│    *    │\n" +
                    "│       * │\n" +
                    "└─────────┘");
            case 4 -> System.out.println(
                    "┌─────────┐\n" +
                    "│ *     * │\n" +
                    "│         │\n" +
                    "│ *     * │\n" +
                    "└─────────┘");
            case 5 -> System.out.println(
                    "┌─────────┐\n" +
                    "│ *     * │\n" +
                    "│    *    │\n" +
                    "│ *     * │\n" +
                    "└─────────┘");
            case 6 -> System.out.println(
                    "┌─────────┐\n" +
                    "│ *     * │\n" +
                    "│ *     * │\n" +
                    "│ *     * │\n" +
                    "└─────────┘");
            default -> System.out.println("None rolled");
        }
    }
}

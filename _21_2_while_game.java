import java.util.Scanner;

public class _21_2_while_game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        while (!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You quit the game");
        scanner.close();
    }
}

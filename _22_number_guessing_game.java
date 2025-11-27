import java.util.Random;
import java.util.Scanner;

public class _22_number_guessing_game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempts = 0;
        int answer;
        String result;

        answer = random.nextInt(1, 100);

        do {
            System.out.println("Enter your guess (1-100)");
            guess = scanner.nextInt();
            attempts++;
            if (guess > answer) {
                System.out.println("Too high");
                attempts++;
            } else if (guess < answer) {
                System.out.println("Too low");
                attempts++;
            }
        } while (guess != answer);
        System.out.println(
            "You guessed: " +
                guess +
                "\nCorrect answer is: " +
                answer +
                "\nNo. of attempts are: " +
                attempts
        );

        scanner.close();
    }
}

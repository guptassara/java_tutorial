import java.util.Random;

public class _8_random {

    public static void main(String[] args) {
        Random random = new Random();
        int number1, number2, number3;
        boolean isHead;

        number1 = random.nextInt(1, 11);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 1001);
        isHead = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        if (isHead) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}

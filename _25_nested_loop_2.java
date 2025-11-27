import java.util.Scanner;

public class _25_nested_loop_2 {

    public static void main(String[] args) {
        // nested loop = A loop inside another loop. USed often with matrices or DSA
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        char symbol;
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter number of symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = rows; i > 0; i--) {
            for (int j = columns; j > 0; j--) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}

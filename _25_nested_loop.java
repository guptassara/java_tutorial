public class _25_nested_loop {

    public static void main(String[] args) {
        //nested loop  = A loop inside another loop. USed often with matrices or DSA
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

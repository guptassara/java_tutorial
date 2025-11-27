public class _24_break_continue {

    public static void main(String[] args) {
        //break = break out of the loop (STOP)
        // continue = skip current iteration of a loop (SKIP)
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}

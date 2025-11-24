public class _5_operators {

    public static void main(String[] args) {
        double x = 10.99;
        double y = 22.98;
        double add = x + y;
        System.out.println(add);
        double sub = x - y;
        System.out.println(sub);
        double mul = x * y;
        System.out.println(mul);
        double div = x / y;
        System.out.println(div);
        double mod = x % y;
        System.out.println(mod);

        // Augmented Assignment operators
        x += y;
        System.out.println(x);
        x -= y;
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        x %= y;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        // order of operators [P-E-N-D-A-S]
        double result = 3 + (4 * (7 - 5)) / 2.0;
        System.out.println(result);
    }
}

public class _27_1_overloadFn {
    public static void main(String[] args) {
        // overload methods = methods that share the same name, but differnet
        // parameters. signature = name + parameters
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

}

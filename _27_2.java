public class _27_2 {
    public static void main(String[] args) {
        String pizza;
        pizza = bakePizza("flat bread");
        System.out.println(pizza);
        pizza = bakePizza("flat bread", "mozzarella");
        System.out.println(pizza);
        pizza = bakePizza("flat bread", "mozzarella", "mushrooms");
        System.out.println(pizza);
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return bread + " " + cheese + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return bread + " " + cheese + " " + topping + " pizza";
    }
}

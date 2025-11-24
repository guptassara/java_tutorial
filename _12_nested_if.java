public class _12_nested_if {

    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 100;
        if (isStudent) {
            if (isSenior) {
                System.out.println("You get 5% senior discount");
                System.out.println("You get 10% student discount");
                price *= 0.85;
            } else {
                System.out.println("You get 10% student discount");
                price *= 0.9;
            }
        } else {
            System.out.println("You get 5% senior discount");
            price *= 0.95;
        }

        System.out.println("The price of movie ticket is: Rs." + price);
    }
}

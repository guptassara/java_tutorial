public class _20_logical {

    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT
        double temp = 200;
        boolean isSunny = false;
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is sunny");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is not sunny");
        } else if (temp >= 30 || temp <= 0 && isSunny) {
            System.out.println("The weather is not GOOD");
            System.out.println("It is sunny");
        } else if (temp >= 30 || (temp <= 0 && !isSunny)) {
            System.out.println("The weather is not GOOD");
            System.out.println("It is not sunny");
        }
    }
}

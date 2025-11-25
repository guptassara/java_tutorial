public class _16_ternery {

    public static void main(String[] args) {
        // ternery operator ? = Return 1 of 2 values if a condition is true
        // variable= (condition)? ifTrue : ifFalse

        int score = 70;
        String result = (score >= 30) ? "Pass" : "Fail";
        System.out.println(result);

        int number = 23;

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String time = (hours<12)? "AM" : "PM";
        System.out.println(time);

        int income = 36000000;
        double tax = (income>1200000)? 0.25: 0.15;
        System.out.print(tax);
    }
}

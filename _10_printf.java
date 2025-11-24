// printf() = is a method used to format output

// %[flags][width][.precision][specifier-character]

public class _10_printf {

    public static void main(String[] args) {
        String name = "Mavuika";
        char firstLetter = 'M';
        int age = 30;
        double height = 164;
        boolean isEmployed = true;
        System.out.printf(
                "Hello %s. Your name starts with %c. You are %d years old. You are %.2f cm tall. Emplyee status is %b \n",
                name,
                firstLetter,
                age,
                height,
                isEmployed);
        // precision
        double price1 = 9.980934988099;
        double price2 = 10.9;
        double price3 = -99.8327;
        System.out.printf("%.2f\n", price1);
        System.out.printf("%.3f\n", price2);
        System.out.printf("%f\n", price3);

        // flags

        // + = output a plus
        // , = comma grouping seperator
        // ( = negative numbers are enclsed is ()
        // space = display a minus if negative, space if positive.
        double price4 = 976767600.980934988099;
        double price5 = -10.9;
        double price6 = -99.8327;
        double price7 = -3498799.8327;
        System.out.printf("%+,.2f\n", price4);
        System.out.printf("% .3f\n", price5);
        System.out.printf("%+f\n", price6);
        System.out.printf("%(.2f\n", price6);
        System.out.printf("%((.2f\n", price7);

        // [width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 22;

        System.out.printf("\n%05d", id1);
        System.out.printf("\n%05d", id2);
        System.out.printf("\n%05d", id3);
        System.out.printf("\n%05d", id4);
        System.out.printf("\n%5d", id1);
        System.out.printf("\n%5d", id2);
        System.out.printf("\n%5d", id3);
        System.out.printf("\n%5d", id4);
        System.out.printf("\n%-5d", id1);
        System.out.printf("\n%-5d", id2);
        System.out.printf("\n%-5d", id3);
        System.out.printf("\n%-5d", id4);
    }
}

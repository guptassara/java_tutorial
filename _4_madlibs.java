import java.util.Scanner;

public class _4_madlibs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb;
        String adjective3;
        String noun2;

        System.out.println("Enter adjective1 ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter noun1 ");
        noun1 = scanner.nextLine();
        System.out.println("Enter adjective2 ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter verb ");
        verb = scanner.nextLine();
        System.out.println("Enter adjective3 ");
        adjective3 = scanner.nextLine();
        System.out.println("Enter noun2 ");
        noun2 = scanner.nextLine();

        String story =
            "On a " +
            adjective1 +
            " day, a " +
            adjective2 +
            " " +
            noun1 +
            " decided to " +
            verb +
            " beside a " +
            adjective3 +
            " " +
            noun2 +
            ". What happened next was truly amazing!";
        String story1 =
            "On a " +
            adjective1 +
            " morning, a " +
            adjective2 +
            " " +
            noun1 +
            " decided to " +
            verb +
            " near the " +
            adjective3 +
            " " +
            noun2 +
            ". It was a day to remember!";

        String story2 =
            "The " +
            adjective1 +
            " " +
            noun1 +
            " felt " +
            adjective2 +
            " after trying to " +
            verb +
            " with the " +
            adjective3 +
            " " +
            noun2 +
            ". Suddenly, everything changed!";

        String story3 =
            "Once upon a time, a " +
            adjective1 +
            " " +
            noun1 +
            " and a " +
            adjective2 +
            " " +
            noun2 +
            " planned to " +
            verb +
            " under the " +
            adjective3 +
            " sun.";

        String story4 =
            "In the middle of a " +
            adjective1 +
            " forest, the " +
            noun1 +
            " and the " +
            adjective2 +
            " " +
            noun2 +
            " loved to " +
            verb +
            " because the air was so " +
            adjective3 +
            ".";

        String story5 =
            "Last summer, my " +
            adjective1 +
            " friend brought a " +
            adjective2 +
            " " +
            noun1 +
            " to " +
            verb +
            " with the " +
            adjective3 +
            " " +
            noun2 +
            ". It was hilarious!";

        System.out.println(story);
        System.out.println(story1);
        System.out.println(story2);
        System.out.println(story3);
        System.out.println(story4);
        System.out.println(story5);
        scanner.close();
    }
}

public class _13_string {

    public static void main(String[] args) {
        String name = "Fauxx Play";
        String password = "faUss play";
        if (name.isEmpty()) {
            System.out.println("String is Empty!");
        } else {
            int length = name.length();
            System.out.printf("length is %d \n", length);
            char letter = name.charAt(0);
            System.out.printf("length is %c \n", letter);
            int index = name.indexOf("x");
            System.out.printf("index is %s \n", index);
            int last_Index = name.lastIndexOf("x");
            System.out.print("last index is " + last_Index + "\n");
            name = name.toUpperCase();
            System.out.printf(name + "\n");
            name = name.toLowerCase();
            System.out.printf(name + "\n");
            name = name.replace("x", "s");
            System.out.printf(name + "\n");
            name = name.trim();
            System.out.printf(name + "\n");
            System.out.println(name.isEmpty());
            if (name.contains(" ")) {
                System.out.println("Name has spaces");
            } else {
                System.out.println("Name has no spaces");
            }
            if (name.equalsIgnoreCase(password)) {
                System.out.println("Name is password. INVALID");
            } else {
                System.out.println("HELLO " + name);
            }
        }
    }
}

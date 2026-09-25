import java.util.Scanner;

public class Password1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] usernames = {"Student"};
        String[] passwords = {"Learning"};

        System.out.print("Enter Username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Enter Password: ");
        String passwordInput = scanner.nextLine();

        if (usernameInput.equals(usernames[0]) && passwordInput.equals(passwords[0])) {
            System.out.println("Welcome to Java programming!");
        } else {
            System.out.println("Invalid username or password!");
        }

        String text1 = "Student";
        String text2 = "Learning";

        System.out.println("Length of text1: " + text1.length());
        System.out.println("Length of text2: " + text2.length());

        System.out.println("Combined text: " + text1.concat(text2));

        System.out.println("Are text1 and text2 equal? " + text1.equals(text2));

        System.out.println("Are text1 and text2 equal ignoring case? "
                + text1.equalsIgnoreCase(text2));

        System.out.println("Does text2 contain 'e'? " + text2.contains("e"));

        System.out.println("Substring of text1 (1,5): " + text1.substring(1, 5));
        System.out.println("Substring of text2 (1,5): " + text2.substring(1, 5));

        System.out.println("Replace 't' with 'x' in text1: "
                + text1.replace('t', 'x'));

        scanner.close();
    }
}

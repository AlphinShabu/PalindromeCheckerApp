import java.util.Scanner;

class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println(" Welcome to Palindrome Checker System ");
        System.out.println("========================================");
        System.out.println("Version: 2.0");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}
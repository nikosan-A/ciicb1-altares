import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input string 
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Step 3: Compare input and reversed string
        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close();
    }
}
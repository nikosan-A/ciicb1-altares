package Assignment;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Length of the string
        System.out.println("Length of the string: " + input.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + input.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + input.toLowerCase());

        // 4. First character
        if (input.length() > 0) {
            System.out.println("First character: " + input.charAt(0));

            // 5. Last character
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }

        // 6. Substring from 2nd to 5th character
        if (input.length() >= 5) {
            System.out.println("Substring (2nd to 5th character): " + input.substring(1, 5));
        } else {
            System.out.println("String is too short to extract substring (2nd to 5th character).");
        }

        scanner.close();
    }
}
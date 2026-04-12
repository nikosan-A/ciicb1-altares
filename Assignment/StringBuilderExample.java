package Assignment;

import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();
        scanner.close();
        // Ensure minimum length
        if (input.length() < 10) {
            System.out.println("Error: String must be at least 10 characters long.");
            
            return;
        }

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder(input);

        // 1. Print length of the string
        System.out.println("Length of the string: " + sb.length());

        // 2. Print first character
        System.out.println("First character: " + sb.charAt(0));

        // 3. Print last character
        System.out.println("Last character: " + sb.charAt(sb.length() - 1));

        // 4. Print index of first occurrence of letter 'd'
        System.out.println("Index of first occurrence of 'd': " + sb.indexOf("d"));

        // 5. Print substring from index 3 to index 6
        System.out.println("Substring (index 3 to 6): " + sb.substring(3, 6));

        // 6. Append "123" to the string
        sb.append("123");
        System.out.println("After appending \"123\": " + sb);

        // 7. Insert "xyz" at index 4
        sb.insert(4, "xyz");
        System.out.println("After inserting \"xyz\" at index 4: " + sb);

        // 8. Delete substring from index 2 to index 4
        sb.delete(2, 4);
        System.out.println("After deleting substring (index 2 to 4): " + sb);

        // 9. Delete character at index 8
        sb.deleteCharAt(8);
        System.out.println("After deleting character at index 8: " + sb);

        // 10. Reverse the string
        sb.reverse();
        System.out.println("Reversed string: " + sb);

        
    }
}
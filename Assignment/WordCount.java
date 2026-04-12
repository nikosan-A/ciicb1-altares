package Assignment;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().trim();

        // Check if input is empty
        if (input.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            // Split the string using spaces
            String[] words = input.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter three numbers (or 'q' to quit):");

            // Check if user wants to quit
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting program...");
                break;
            }

            try {
                // First number
                int num1 = Integer.parseInt(input);

                // Second number
                System.out.print("Enter second number: ");
                String input2 = scanner.nextLine();
                if (input2.equalsIgnoreCase("q")) break;
                int num2 = Integer.parseInt(input2);

                // Third number
                System.out.print("Enter third number: ");
                String input3 = scanner.nextLine();
                if (input3.equalsIgnoreCase("q")) break;
                int num3 = Integer.parseInt(input3);

                // Logic for largest number
                if (num1 == num2 && num2 == num3) {
                    System.out.println("All numbers are equal");
                } else {
                    int largest = Math.max(num1, Math.max(num2, num3));
                    System.out.println("Largest number is: " + largest);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers or 'q' to quit.");
            }
        }

        scanner.close();
    }
}

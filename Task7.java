import java.util.Scanner;

public class Task7 {

    // Arithmetic methods
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Input first number (decimal)
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            // Choose operation BEFORE second number
            System.out.println("\nChoose operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter choice (1-4): ");
            int choice = sc.nextInt();

            // Input second number (decimal)
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Perform chosen operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            // Ask if user wants another operation or exit
            System.out.print("\nDo you want to perform another operation? (y/n): ");
            char again = sc.next().charAt(0);
            if (again == 'n' || again == 'N') {
                continueProgram = false;
                System.out.println("Exiting program. Goodbye!");
            }
        }

        sc.close();
    }
}
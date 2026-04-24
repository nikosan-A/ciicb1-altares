import java.util.Scanner;
import static java.lang.Math.*;  // static import for Math methods

public class Task9 {

    // Addition using Math.addExact()
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction using Math.subtractExact()
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication using Math.multiplyExact()
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division using Math.floorDiv()
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Input first integer
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            // Choose operation BEFORE second number
            System.out.println("\nChoose operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter choice (1-4): ");
            int choice = sc.nextInt();

            // Input second integer
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Perform chosen operation
            int result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Result = " + result);

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

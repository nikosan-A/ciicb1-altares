import java.util.Scanner;

public class Task8 {

    // Method to compute cumulative sum of a single number
    public static int cumulativeSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;
        int grandTotal = 0;

        while (continueProgram) {
            // Prompt for a new number
            System.out.print("Enter a new number: ");
            int num = sc.nextInt();

            // Compute cumulative sum for this number
            int partial = cumulativeSum(num);
            System.out.println("Cumulative sum of " + num + " = " + partial);

            // Add to grand total
            grandTotal += partial;
            System.out.println("Current grand total = " + grandTotal);

            // Ask if user wants another number or exit
            System.out.print("\nDo you want to enter another number? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                continueProgram = false;
                System.out.println("Final grand total = " + grandTotal);
                System.out.println("Exiting program. Goodbye!");
            }
        }

        sc.close();
    }
}

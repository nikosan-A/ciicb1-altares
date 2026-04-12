package Assignment;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }

        System.out.println("Sum of all integer inputs: " + sum);

        scanner.close();
    }
}
package Assignment;

import java.util.Scanner;

public class SumAndAverageArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Output results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
package Assignment;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
        } else {
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("The number is zero.");
            } else {
                // Check positive or negative
                if (num > 0) {
                    System.out.print("The number is positive and ");
                } else {
                    System.out.print("The number is negative and ");
                }

                // Check odd or even
                if (num % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            }
        }

        scanner.close();
    }
}
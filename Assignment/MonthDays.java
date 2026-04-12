package Assignment;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                System.out.println("Number of days: 31");
                break;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                System.out.println("Number of days: 30");
                break;

            case 2:  // February
                System.out.println("Number of days: 28");
                break;

            default:
                System.out.println("Invalid month number. Please enter 1–12.");
        }

        scanner.close();
    }
}

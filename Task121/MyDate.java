package Task121;

public class MyDate {
    public static void main(String[] args) {

        // 13. Set specific dates
        DateTask date1 = new DateTask(1, 1, 1978);   // January 1, 1978
        DateTask date2 = new DateTask(9, 21, 1984);  // September 21, 1984

        // Print the dates
        System.out.println(date1.toString());
        System.out.println(date2.toString());

        // 14. Display leap years after printing date2
        DateTask.leapYears();
    }
}
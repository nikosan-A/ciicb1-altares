public class TaskSheet113 {

    public static void main(String[] args) {

        // Step 2: initialize check_number
        int check_number = 10;

        // Step 3: declare message variable
        String message;

        // Step 4 & 5: loop and check odd/even
        for (int i = 1; i <= check_number; i++) {

            message = (i % 2 == 0) ? " is even number" : " is odd number";

            // Step 6: print result
            System.out.println(i + message);
        }
    }
}
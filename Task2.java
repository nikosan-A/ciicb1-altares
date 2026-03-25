public class Task2 {
    public static void main(String[] args) {
        // primitives
        char H = 'H';
        byte three = 3;
        int one = 1;
        short zero = 0;
        float twoPointZero = 2.0f;
        boolean truth = true;

        // build the output string
        String output = "" + H + three + one + one + zero + " w" + zero + "r" + one + "d " 
                        + twoPointZero + " " + truth;

        // print result
        System.out.println(output);
    }
}

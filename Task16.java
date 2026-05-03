interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla...");
            return true;
        } else {
            System.out.println("Not feeding time yet.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Attempting to pet the gorilla...");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();

        System.out.println("Feeding:");
        g.feed(true);

        System.out.println("\nGrooming:");
        g.groom();

        System.out.println("\nPetting:");
        g.pet();
    }
}

package Task13;

// Base class
class Afritada {
    public void showIngredients() {
        String[] ingredients = {
            "Tomato Sauce",
            "Meat"
        };
        System.out.println("Afritada = "
                + java.util.Arrays.toString(ingredients) + " 🍲\n");
    }
}

// Machado extends Afritada
class Machado extends Afritada {
    @Override
    public void showIngredients() {
        String[] ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste"
        };
        System.out.println("Machado = "
                + java.util.Arrays.toString(ingredients) + " 🍲\n");
    }
}

// Menudo extends Afritada
class Menudo extends Afritada {
    @Override
    public void showIngredients() {
        String[] ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Liver Spread",
            "Raisins",
            "Hotdog"
        };
        System.out.println("Menudo = "
                + java.util.Arrays.toString(ingredients) + " 🍲\n");
    }
}

// Caldereta extends Afritada
class Caldereta extends Afritada {
    @Override
    public void showIngredients() {
        String[] ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste",
            "Liver Spread",
            "Raisins",
            "Hotdog",
            "Cheese"
        };
        System.out.println("Caldereta = "
                + java.util.Arrays.toString(ingredients) + " 🍲\n");
    }
}

// Main class
public class Task131 {
    public static void main(String[] args) {

        // Step 6: Create objects
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Machado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        // Step 7: Display ingredients
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
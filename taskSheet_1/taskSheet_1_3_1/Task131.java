package taskSheet_1_3_1;

import java.util.ArrayList;
import java.util.List;

// PARENT CLASS (AFRITADA CLASS)
class Afritada {
    public void showIngredients() {
        String[] Ingredients = { "Tomato Sauce", "Meat" };
        System.out.println("Afritada = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// MECHADO CLASS
class Mechado extends Afritada {

    @Override
    public void showIngredients() {
        String[] Ingredients = { "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Tomato Paste",
                "Siling Labuyo" };
        System.out.println("Mechado = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// MENUDO CLASS
class Menudo extends Afritada {

    @Override
    public void showIngredients() {
        String[] Ingredients = { "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Liver Spread",
                "Raisins",
                "Hotdog",
                "Siling Labuyo" };
        System.out.println("Menudo = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// CALDERETA CLASS
class Caldereta extends Afritada {

    @Override
    public void showIngredients() {
        String[] Ingredients = { "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Tomato Paste",
                "Liver Spread",
                "Raisins",
                "Hotdog",
                "Siling Labuyo",
                "Cheese" };
        System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// MAIN CLASS
public class Task131 {
    public static void main(String[] args) {
        // add 4 meal$ objects here and set the type as the extended Afritada class
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Caldereta();
        Afritada meal3 = new Mechado();
        Afritada meal4 = new Menudo();

        List<Afritada> meals = new ArrayList<Afritada>(4);

        meals.add(meal1);
        meals.add(meal2);
        meals.add(meal3);
        meals.add(meal4);

        for (Afritada meal : meals) {
            meal.showIngredients();
        }

    }

}
package std.lava.general.patterns;
class Meal {
}

abstract class MealBuilder {
    protected Meal meal = new Meal();
    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildDessert();
    public abstract Meal getMeal();
}

class KidsMealBuilder extends MealBuilder {
    public void buildDrink() {
        // add drinks to the meal
    }
    
    public void buildMain() {
        // add main part of the meal
    }

    public void buildDessert() {
        // add desert part to the meal
    }

    public Meal getMeal() {
        return meal;
    }
}

class AdultMealBuilder extends MealBuilder {
    public void buildDrink() {
        // add drinks to the meal
    }
    
    public void buildMain() {
        // add main part of the meal
    }

    public void buildDessert() {
        // add desert part to the meal
    }

    public Meal getMeal() {
        return meal;
    }
}

class MealDirector {
    public Meal createMeal(MealBuilder builder) {
        builder.buildDrink();
        builder.buildMain();
        builder.buildDessert();
        return builder.getMeal();
    }
}

public class BuilderPattern1 {
    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        boolean isKid = true;
        MealBuilder builder = null;
        if (isKid) {
            builder = new KidsMealBuilder();
        }
        else {
            builder = new AdultMealBuilder();
        }
        Meal meal = director.createMeal(builder);
    }
}

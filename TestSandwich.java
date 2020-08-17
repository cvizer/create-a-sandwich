package tipTopBakery;

public class TestSandwich {

    public static void main(String[] args) {
        Bread bread1 = new Bread("Whole Wheat", 55);
        SandwichFilling sandwichFilling1 = new SandwichFilling("Tuna", 65);
        Sandwich sandwich1 = new Sandwich(bread1, sandwichFilling1);

        displayData(sandwich1, 1);

        Bread bread2 = new Bread("White", 75);
        SandwichFilling filling2 = new SandwichFilling("Turkey", 80);
        Sandwich sandwich2 = new Sandwich();
        sandwich2.setBread(bread2);
        sandwich2.setSandwichFilling(filling2);

        displayData(sandwich2, 2);

        Bread bread3 = new Bread("Italian Herbs and Cheese", 130);
        SandwichFilling sandwichFilling3 = new SandwichFilling("Steak and Cheese", 200);
        Sandwich sandwich3 = new Sandwich();
        sandwich3.setBread(bread3);
        sandwich3.setSandwichFilling(sandwichFilling3);

        displayData(sandwich3, 3);
    }

    public static float calculateTotalCalories(Sandwich sandwich) {
        float total = (sandwich.getBread().getCaloriesPerSlice() * 2) + sandwich.getSandwichFilling().getCaloriesPerServing();
        return total;
    }

    public static float calculateTotalCalories(Bread bread, SandwichFilling sandwichFilling) {
        float total = (bread.getCaloriesPerSlice() * 2) + sandwichFilling.getCaloriesPerServing();
        return total;
    }

    public static void displayData(Sandwich sandwich, int count) {
        System.out.println("Motto: " + sandwich.getBread().MOTTO);
        System.out.println("------ Sandwich " + count + " ------");
        System.out.println("Bread Type: " + sandwich.getBread().getBreadType());
        System.out.println("Calories Per Slice: " + sandwich.getBread().getCaloriesPerSlice());
        System.out.println("Filling Type: " + sandwich.getSandwichFilling().getFillingType());
        System.out.println("Calories per serving: " + sandwich.getSandwichFilling().getCaloriesPerServing());
        System.out.println("Total Calories: " + calculateTotalCalories(sandwich));
        System.out.println();
        System.out.println();
    }

}

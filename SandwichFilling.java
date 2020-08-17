package tipTopBakery;

public class SandwichFilling {

    private String fillingType;
    private int caloriesPerServing;

    public SandwichFilling(){}
    public SandwichFilling(String filling, int caloriesServing) {
        this.setFillingType(filling);
        this.setCaloriesPerServing(caloriesServing);
    }

    public void setFillingType(String filling2) {
        this.fillingType = filling2;
    }

    public void setCaloriesPerServing(int cal) {
        this.caloriesPerServing = cal;
    }

    public String getFillingType() {
        return fillingType;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

}

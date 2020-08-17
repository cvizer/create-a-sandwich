package tipTopBakery;

public class Bread {

    private String breadType;
    private float caloriesPerSlice;
    public static final String MOTTO = "The staff of life.";

    public Bread(){}
    public Bread(String bread, float caloriesSlice) {
        this.setBreadType(bread);
        this.setCaloriesPerSlice(caloriesSlice);
    }

    public void setBreadType(String bread2) {
        this.breadType = bread2;
    }

    public void setCaloriesPerSlice(float calories) {
        this.caloriesPerSlice = calories;
    }

    public String getBreadType() {
        return breadType;
    }

    public float getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

}

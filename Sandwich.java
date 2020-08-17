package tipTopBakery;

public class Sandwich {

    Bread bread;
    SandwichFilling sandwichFilling;

    public Sandwich(){}
    public Sandwich(Bread bread, SandwichFilling sandwichFilling) {
        this.setBread(bread);
        this.setSandwichFilling(sandwichFilling);
    }
    public Sandwich(String bread, float caloriesSlice, String filling, int caloriesServing) {
        this.bread = new Bread(bread, caloriesSlice);
        this.sandwichFilling = new SandwichFilling(filling, caloriesServing);
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public SandwichFilling getSandwichFilling() {
        return sandwichFilling;
    }

    public void setSandwichFilling(SandwichFilling sandwichFilling) {
        this.sandwichFilling = sandwichFilling;
    }
}

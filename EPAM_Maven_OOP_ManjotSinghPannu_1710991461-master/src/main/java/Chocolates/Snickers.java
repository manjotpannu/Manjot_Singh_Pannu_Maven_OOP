package Chocolates;

public class Snickers extends chocolate {
    public Snickers()
    {
        super.setWeight(80);
        super.setPrice(50);
        super.setCalories(250);
    }

    @Override
    public String toString() {
        return super.toString("Bournville");
    }
}

package Cakes;

public class Butterscotch implements cake {
    private double weight = 550;
    private double price = 600;
    private double calories = 1178;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Butterscotch{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}

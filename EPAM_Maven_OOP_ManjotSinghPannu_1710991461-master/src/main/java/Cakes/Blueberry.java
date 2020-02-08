package Cakes;

public class Blueberry implements cake {

    private double weight = 800;
    private double price = 500;
    private double calories = 2715;

    @Override
    public double getCalories() {
        return calories;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Blueberry{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}

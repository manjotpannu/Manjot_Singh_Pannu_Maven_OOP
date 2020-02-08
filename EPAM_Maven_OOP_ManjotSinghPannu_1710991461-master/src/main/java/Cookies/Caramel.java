package Cookies;

public class Caramel extends cookies {
    double weight = 80;
    double price = 45;
    double calories = 110;

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
        return "CaramelChip{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}

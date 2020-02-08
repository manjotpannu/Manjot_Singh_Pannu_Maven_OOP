package Cookies;

public class ChocoChip extends cookies  {
    double weight = 55;
    double price = 10;
    double calories = 90;

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
        return "ChocoChip{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}

import java.util.ArrayList;

public class Sundae extends DessertItem {

    private double sundaeCost;
    private int sundaeCalories;
    private String topping;

    public Sundae() {

        super("");
    }

    public Sundae(String newName) {

        super(newName + "(Sundae)");
    }

    public void setCost(double newCost) {

        sundaeCost = newCost;
    }

    public double getCost() {

        return Math.round(((sundaeCost) * 100.0)) / 100.0;
    }

    public void setCalories(int newCalories) {

        sundaeCalories = newCalories;
    }

    public int getCalories() {

        return sundaeCalories;
    }

    public void setTopping(String newTopping) {

        topping = newTopping + "(Topping)";
    }

    public String getTopping() {

        return topping;
    }

    @Override
    public String toString() {

        String message = "";
        String cost = String.format("%.2f", getCost());

        if (name == "") {
            message += " with " + "\n                          " + cost;
        }

        else {
            message += "\n" + name + " with\n" + topping +
                    "\n                          " + cost + "\n\n" + name + " Calories: "
                    + getCalories() + "\n";
        }

        return message;
    }
}


public class Candy extends DessertItem {

    private double candyCostPerPound;
    private double candyWeight;
    private int candyCalories;

    public Candy() {

        super("");
    }

    public Candy(String newName) {

        super(newName + "(Candy)");
    }

    public void setCost(double newCost) {

        candyCostPerPound = newCost;
    }

    public double getCost() {

        return Math.round(candyCostPerPound * 100.0) / 100.0;
    }

    public void setWeight(double newWeight) {

        candyWeight = newWeight;
    }

    public double getWeight() {

        return Math.round((candyWeight) * 100.0) / 100.0;
    }

    public void setCalories(int newCalories) {

        candyCalories = newCalories;
    }

    public int getCalories() {

        return candyCalories;
    }

    @Override
    public String toString() {

        String message = "\n" + candyWeight + " lbs. @ " + candyCostPerPound + " /lb.";

        double cost = candyWeight * candyCostPerPound;
        String finalCost = String.format("%.2f", cost);

        if (name == "") {
            message += "\n                          " + finalCost;
        }
        else {
            message += "\n" + name + "\n                         " + finalCost +
                    "\n\n" + name + " Calories: " + getCalories() + "\n";
        }

        return message;
    }

}

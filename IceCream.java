public class IceCream extends DessertItem {

    private double iceCreamCost;
    private int iceCreamCalories;

    public IceCream() {

        super("");
    }

    public IceCream(String newName) {
        super(newName + "(IceCream)");
    }

    public void setCost(double newCost) {

        iceCreamCost = newCost;
    }

    public double getCost() {

        return Math.round(iceCreamCost * 100.0) / 100.0;
    }

    public void setCalories(int newCalories) {

        iceCreamCalories = newCalories;
    }

    public int getCalories() {

        return iceCreamCalories;
    }

    @Override
    public String toString() {

        String message = "";
        String cost = String.format("%.2f", getCost());

        if (name == "") {
            message += "                          " + cost;
        }

        else {
            message += "\n" + "Ice Cream" + name + "\n                          " + cost +
            "\n\n" + name + " Calories: " + getCalories() + "\n";
        }

        return message;
    }

}


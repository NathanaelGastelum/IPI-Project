/* Lionel Quintanilla and Nathanael Gastelum
   February 19, 2020
   Purpose: This program calculates cost and calories from a shopping cart of desserts and prints a sorted receipt
*/

public class Cookie extends DessertItem {

    private double cookieCostPerDozen;
    private int numCookies;
    private int cookieCalories;

    public Cookie() {

        super("");
    }

    public Cookie(String newName) {

        super(newName + "(Cookie)");
    }

    public void setCost(double newCost) {

        cookieCostPerDozen = newCost;
    }

    public double getCost() {

        return Math.round(cookieCostPerDozen * 100.0) / 100.0;
    }

    public void setNumCookies(int newNum) {

        numCookies = newNum;
    }

    public int getNumCookies() {

        return numCookies;
    }

    public void setCalories(int newCalories) {

        cookieCalories = newCalories;
    }

    public int getCalories() {

        return cookieCalories;
    }

    @Override
    public String toString() {

        String message = "\n" + numCookies + " @ " + cookieCostPerDozen + " /dz.";

        double cost = cookieCostPerDozen * (numCookies/12.0);
        String finalCost = String.format("%.2f", cost);

        if (name == "") {
            message += "\n                          " + finalCost + "\n";
        }
        else {
            message += "\n" + name + "\n                          " + finalCost +
            "\n\n" + name + " Calories: " + getCalories() + "\n";
        }

        return message;
    }
}

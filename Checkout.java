import java.util.ArrayList;

public class Checkout {

    private ArrayList<DessertItem> itemRegister;
    private double salesTax;

    public Checkout() {
        itemRegister = new ArrayList<>();
        salesTax = .1025;
    }

    public void enterItem(DessertItem newItem) {

        itemRegister.add(newItem);
    }

    public int numberOfItems() {

        return itemRegister.size();
    }

    public void clear() {

        itemRegister.clear();
    }

    public double totalCost() {

        double cost = 0.00;

        for (int i = 0; i < itemRegister.size(); i++) {
            cost += itemRegister.get(i).getCost();
        }

        return Math.round(cost * 100.0) / 100.0;
    }

    public double getTaxRate() {
        return salesTax;
    }

    public void setTaxRate(double newTax) {
        salesTax = newTax;
    }

    public double totalTax() {

        return Math.round((totalCost() * getTaxRate()) * 100.0) / 100.0;
    }

    @Override
    public String toString() {

        String message =("---------- 7/11 ----------\n\n");

        for (DessertItem i : itemRegister) {
            message += i.name +"         \n"+ "                         " +i.getCost() + "\n";
        }

        message += "SubTotal: " + totalCost() + "\n";
        message += "Tax: " + totalTax() + "\n";
        message += "Total: " + (totalCost() + totalTax()) + "\n";

        return message;
    }
}

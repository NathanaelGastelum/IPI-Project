/* Lionel Quintanilla and Nathanael Gastelum
   February 19, 2020
   Purpose: This program calculates cost and calories from a shopping cart of desserts and prints a sorted receipt
*/

public abstract class DessertItem implements java.lang.Comparable<DessertItem> {

    protected String name;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }
    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }
    /**
     * Returns name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }
    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract double getCost();

    public abstract int getCalories();

    public int compareTo(DessertItem otherItem) {

        if (this.getCalories() > otherItem.getCalories()) {
            return 1;
        }
        else if (this.getCalories() < otherItem.getCalories()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}


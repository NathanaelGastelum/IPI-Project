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


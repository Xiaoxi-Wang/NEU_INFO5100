

public abstract class DessertItem {
    protected String name;

    public DessertItem() {}
    public DessertItem(String name) {
        if (name.length() <= DessertShoppe.maxItemNameSize) {
            this.name = name;
        } else {
            this.name = name.substring(0, DessertShoppe.maxItemNameSize);
        }
    }
    public final String getName() { return this.name; }
    public abstract int getCost();
}
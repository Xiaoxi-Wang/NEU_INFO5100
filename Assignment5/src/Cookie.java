
public class Cookie extends DessertItem {
    int number;
    int pricePerDozen;

    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen; // in cents
    }

    @Override
    public int getCost() { return Math.round(number * pricePerDozen / 12); }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(number).append(" @ ").
                append(DessertShoppe.cents2DollarsAndCentsMethod(pricePerDozen)).
                append(" /dz.\n").append(getName());
        String cost = DessertShoppe.cents2DollarsAndCentsMethod(getCost());
        int spaceNum = DessertShoppe.costWidth - getName().length() - cost.length();
        for (int i = 0; i < spaceNum; i++) { sb.append(" "); }
        return sb + cost;
    }
}

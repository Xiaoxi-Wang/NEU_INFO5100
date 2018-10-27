

public class IceCream extends DessertItem {
    int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost; // in cents
    }

    @Override
    public int getCost() {
        return cost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        String cost = DessertShoppe.cents2DollarsAndCentsMethod(getCost());
        int spaceNum = DessertShoppe.costWidth - getName().length() - cost.length();
        for (int i = 0; i < spaceNum; i++) { sb.append(" "); }
        return sb + cost;
    }
}



public class Sundae extends IceCream {
    String topping;
    int toppingCost;
    public Sundae(String name, int cost, String topping, int toppingCost) {
        super(name, cost);
        this.topping = topping;
        this.toppingCost = toppingCost;
    }

    @Override
    public int getCost() { return Math.round(cost + toppingCost);}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(topping).append(" Sundae with\n").append(getName());
        String cost = DessertShoppe.cents2DollarsAndCentsMethod(getCost());
        int spaceNum = DessertShoppe.costWidth - getName().length() - cost.length();
        for (int i = 0; i < spaceNum; i++) { sb.append(" "); }
        return sb + cost;
    }
}

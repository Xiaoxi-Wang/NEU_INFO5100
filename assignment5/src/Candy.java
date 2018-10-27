public class Candy extends DessertItem {
    double weight;
    int pricePerPound;

    public Candy(String name, double weight, int pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound; // in cents
    }

    @Override
    public int getCost() {
        double cost = weight * pricePerPound;
        return (int) Math.round(cost);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(weight).append(" lbs.").append(" @ ").
                append(DessertShoppe.cents2DollarsAndCentsMethod(pricePerPound)).
                append(" /lb.\n").append(getName());
        String cost = DessertShoppe.cents2DollarsAndCentsMethod(getCost());
        int spaceNum = DessertShoppe.costWidth - getName().length() - cost.length();
        for (int i = 0; i < spaceNum; i++) { sb.append(" "); }
        return sb + cost;
    }
}



import java.util.ArrayList;
import java.util.List;

public class Checkout {
    List<DessertItem> itemList = new ArrayList<>();
    public Checkout() {}

    public int numberOfItems() { return itemList.size(); }
    public void enterItem(DessertItem item) { itemList.add(item); }
    public void clear() { itemList.clear(); }
    public int totalCost() { // total cost of items in cents without tax
        int total = 0;
        for (DessertItem item : itemList) { total += item.getCost(); }
        return total;
    }
    public int totalTax() { // total tax on items in cents
        double tax = DessertShoppe.taxRateInWA * totalCost();
        return (int) Math.round(tax);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        // store name
        int spaceNum = (DessertShoppe.costWidth - DessertShoppe.storeName.length()) / 2;
        for (int i = 0; i < spaceNum; i++) {
            sb.append(" ");
        }
        sb.append(DessertShoppe.storeName).append("\n").append("\n");
        // items
        for (DessertItem item : itemList) {
            sb.append(item).append("\n");
        }
        // tax and total cost
        String tax = DessertShoppe.cents2DollarsAndCentsMethod(totalTax());
        spaceNum = DessertShoppe.costWidth - "Tax".length() - tax.length();
        sb.append("\n").append("Tax");
        for (int i = 0; i < spaceNum; i++) {
            sb.append(" ");
        }
        sb.append(tax).append("\n").append("Total Cost");
        String totalCost = DessertShoppe.cents2DollarsAndCentsMethod(totalCost() + totalTax());
        spaceNum = DessertShoppe.costWidth - "Total Cost".length() - totalCost.length();
        for (int i = 0; i < spaceNum; i++) {
            sb.append(" ");
        }
        sb.append(totalCost).append("\n");
        return String.valueOf(sb);
    }
}



public class DessertShoppe {
    static double taxRateInWA = 0.065;
    static String storeName = "M & M Dessert Shoppe";
    static int maxItemNameSize = 25;
    static int costWidth = 35;
    public static String cents2DollarsAndCentsMethod(int cents) {
        double cents2Dollars = (double) cents / 100;
        return String.format("%.2f", cents2Dollars);
    }
}

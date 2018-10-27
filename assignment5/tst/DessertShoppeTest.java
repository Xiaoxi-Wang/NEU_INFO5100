import org.junit.Assert;
import org.junit.Test;

public class DessertShoppeTest {
    DessertShoppe dessertShoppeTypes = new DessertShoppe();

    @Test
    public void testCents2DollarsAndCentsMethod() {
        String res = "2.50";
        Assert.assertEquals(dessertShoppeTypes.cents2DollarsAndCentsMethod(250), res);
    }
}

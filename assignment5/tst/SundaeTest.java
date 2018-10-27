import org.junit.Assert;
import org.junit.Test;

public class SundaeTest {
    Sundae sundaeTypes = new Sundae("Sundae with Choc. Chip Ice Cream", 142,
            "Hot Fudge", 75);

    @Test
    public void testGetCost() {
        int res = 217;
        Assert.assertEquals(sundaeTypes.getCost(), res);
    }

}

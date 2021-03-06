import org.junit.Assert;
import org.junit.Test;
import static org.junit.matchers.JUnitMatchers.*;

public class CandyTest {
    Candy candyTypes = new Candy("Salt Water Taffy", 3.0, 209);

    @Test
    public void testGetCost() {
        // Can get the correct result
        int res = 627;
        Assert.assertEquals(candyTypes.getCost(), res);
        Assert.assertThat(candyTypes.toString(), containsString("Salt"));
    }


}

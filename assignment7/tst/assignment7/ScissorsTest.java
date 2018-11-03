package assignment7;

import org.junit.Assert;
import org.junit.Test;

public class ScissorsTest {

    @Test
    public void fight() {
        Scissors s = new Scissors(6);
        Paper p = new Paper(11);
        Rock r = new Rock(4);
        Assert.assertEquals(r.fight(p), false);
        Assert.assertEquals(r.fight(s), true);
    }
}
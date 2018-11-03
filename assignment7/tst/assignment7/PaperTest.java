package assignment7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaperTest {

    @Test
    public void fight() {
        Scissors s = new Scissors(6);
        Paper p = new Paper(6);
        Rock r = new Rock(15);
        Assert.assertEquals(p.fight(r), false);
        Assert.assertEquals(p.fight(s), false);
    }
}
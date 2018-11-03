package assignment7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RockTest {

    @Test
    public void fight() {
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        Assert.assertEquals(r.fight(p), true);
        Assert.assertEquals(r.fight(s), true);
    }

}
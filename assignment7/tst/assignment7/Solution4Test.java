package assignment7;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution4Test {

    @Test
    public void merge() {
        List<Interval> intervals = new LinkedList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(5, 7));
        intervals.add(new Interval(6, 8));
        Assert.assertEquals(Solution4.merge(intervals).get(0).start, 1);
        Assert.assertEquals(Solution4.merge(intervals).get(0).end, 4);
        Assert.assertEquals(Solution4.merge(intervals).get(1).start, 5);
        Assert.assertEquals(Solution4.merge(intervals).get(1).end, 8);

    }
}
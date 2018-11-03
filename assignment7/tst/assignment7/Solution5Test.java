package assignment7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution5Test {

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};
        int[] nums3 = new int[] {1, 2};
        int[] nums4 = new int[] {3, 4};
        Assert.assertEquals(Solution5.findMedianSortedArrays(nums1, nums2), 2.0, 0.0);
        Assert.assertEquals(Solution5.findMedianSortedArrays(nums3, nums4), 2.5, 0.0);
    }
}
package sort;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTests {
    @Test
    public void testSortAscendingOrder() {
        int[] input = new int[] {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
        Assert.assertArrayEquals(new int[]{2, 3, 5, 6, 7, 9, 10, 11, 12, 14}, MergeSort.sort(input, true));
    }

//    @Test
//    public void testSortDescendingOrder() {
//        int[] input = new int[] {5, 6, 3, 2, 7, 4, 1, 0};
//        Assert.assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1, 0}, SelectionSort.sort(input, false));
//    }
}

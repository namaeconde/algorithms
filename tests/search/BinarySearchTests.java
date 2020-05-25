package search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTests {

    @Test
    public void testSearchWithinArray() {

        // Given
        int[] array = new int[] {1, 2, 3, 4, 7, 8, 9, 10};
        int X = 8;
        int expectedIndex = 5;

        Assert.assertEquals(expectedIndex, BinarySearch.search(array, 0, array.length-1, X));
    }

    @Test
    public void testSearchNotFound() {

        // Given
        int[] array = new int[] {1, 2, 3, 4, 7, 8, 9, 10};
        int X = 11;
        int expectedIndex = -1;

        Assert.assertEquals(expectedIndex, BinarySearch.search(array, 0, array.length-1, X));
    }
}

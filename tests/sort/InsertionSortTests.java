package sort;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTests {

  @Test
  public void testSortAscendingOrder() {
    int[] input = new int[] {5, 6, 3, 2, 7, 4, 1, 0};
    Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, InsertionSort.sort(input, true));
    Assert.assertArrayEquals(null, InsertionSort.sort(new int[]{}, true));
  }

  @Test
  public void testSortDescendingOrder() {
    int[] input = new int[] {5, 6, 3, 2, 7, 4, 1, 0};
    Assert.assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1, 0}, InsertionSort.sort(input, false));
    Assert.assertArrayEquals(null, InsertionSort.sort(null, false));
  }
}

package sort;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTests {

  @Test
  public void testSortAscendingOrder() {
    int[] input = new int[]{5, 6, 3, 2, 7, 4, 1, 0};
    Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, QuickSort.sort(input, 0, input.length - 1));
  }
}

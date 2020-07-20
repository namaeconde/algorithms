package search;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTests {

  @Test
  public void testSearch() {
    int[] input = new int[]{1, 3, 65, 23, 4, 5, 7};
    Assert.assertEquals(5, LinearSearch.searchXInArray(input, 5).intValue());
  }
}

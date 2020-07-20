package problems;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticTests {

  @Test
  public void testDivision() {
    Assert.assertEquals(1.0, Arithmetic.divide(1, 1), 0);
    Assert.assertEquals(2.0, Arithmetic.divide(4, 2), 0);
    Assert.assertEquals(0.5, Arithmetic.divide(1, 2), 0);
    Assert.assertEquals(1.7, Arithmetic.divide(7, 4), 0);
  }
}

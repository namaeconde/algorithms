package problems;

import org.junit.Assert;
import org.junit.Test;

public class FindMiddleTests {

  @Test
  public void testFindMiddleWithOddElements() {
    FindMiddle.Node node2 = new FindMiddle.Node(3, null);
    FindMiddle.Node node1 = new FindMiddle.Node(2, node2);
    FindMiddle.Node start = new FindMiddle.Node(1, node1);


    Assert.assertEquals(2, FindMiddle.findMiddle(start));
  }

  @Test
  public void testFindMiddleWithNull() {

    Assert.assertEquals(-1, FindMiddle.findMiddle(null));
  }

  @Test
  public void testFindMiddleWith2Elements() {

    FindMiddle.Node node1 = new FindMiddle.Node(2, null);
    FindMiddle.Node start = new FindMiddle.Node(1, node1);

    Assert.assertEquals(1, FindMiddle.findMiddle(start));
  }

  @Test
  public void testFindMiddleWithEvenElements() {
    FindMiddle.Node node5 = new FindMiddle.Node(6, null);
    FindMiddle.Node node4 = new FindMiddle.Node(5, node5);
    FindMiddle.Node node3 = new FindMiddle.Node(4, node4);
    FindMiddle.Node node2 = new FindMiddle.Node(3, node3);
    FindMiddle.Node node1 = new FindMiddle.Node(2, node2);
    FindMiddle.Node start = new FindMiddle.Node(1, node1);


    Assert.assertEquals(3, FindMiddle.findMiddle(start));
  }
}

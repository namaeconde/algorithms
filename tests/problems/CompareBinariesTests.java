package problems;

import org.junit.Assert;
import org.junit.Test;

public class CompareBinariesTests {

    @Test
    public void testCompareEqualBinaries() {

      CompareBinaries.Node bt1_l3 = new CompareBinaries.Node(4, null, null);
      CompareBinaries.Node bt1_r4 = new CompareBinaries.Node(5, null, null);

      CompareBinaries.Node bt1_l2 = new CompareBinaries.Node(4, null, null);
      CompareBinaries.Node bt1_r2 = new CompareBinaries.Node(5, null, null);

      CompareBinaries.Node bt1_l1 = new CompareBinaries.Node(2, bt1_l2, bt1_r2);
      CompareBinaries.Node bt1_r1 = new CompareBinaries.Node(3, bt1_l3, bt1_r4);
      CompareBinaries.Node bt1_root = new CompareBinaries.Node(1, bt1_l1, bt1_r1);

      CompareBinaries.Node bt2_l3 = new CompareBinaries.Node(4, null, null);
      CompareBinaries.Node bt2_r4 = new CompareBinaries.Node(5, null, null);

      CompareBinaries.Node bt2_l2 = new CompareBinaries.Node(4, null, null);
      CompareBinaries.Node bt2_r2 = new CompareBinaries.Node(5, null, null);

      CompareBinaries.Node bt2_l1 = new CompareBinaries.Node(2, bt2_l2, bt2_r2);
      CompareBinaries.Node bt2_r1 = new CompareBinaries.Node(3, bt2_l3, bt2_r4);
      CompareBinaries.Node bt2_root = new CompareBinaries.Node(1, bt2_l1, bt2_r1);

      Assert.assertEquals(true, CompareBinaries.equals(bt1_root, bt2_root));
    }

  @Test
  public void testCompareNotEqualBinaries() {

    CompareBinaries.Node bt1_l3 = new CompareBinaries.Node(4, null, null);
    CompareBinaries.Node bt1_r4 = new CompareBinaries.Node(5, null, null);

    CompareBinaries.Node bt1_l1 = new CompareBinaries.Node(2, null, null);
    CompareBinaries.Node bt1_r1 = new CompareBinaries.Node(3, bt1_l3, bt1_r4);
    CompareBinaries.Node bt1_root = new CompareBinaries.Node(1, bt1_l1, bt1_r1);

    CompareBinaries.Node bt2_l3 = new CompareBinaries.Node(4, null, null);
    CompareBinaries.Node bt2_r4 = new CompareBinaries.Node(5, null, null);

    CompareBinaries.Node bt2_l2 = new CompareBinaries.Node(4, null, null);
    CompareBinaries.Node bt2_r2 = new CompareBinaries.Node(5, null, null);

    CompareBinaries.Node bt2_l1 = new CompareBinaries.Node(2, bt2_l2, bt2_r2);
    CompareBinaries.Node bt2_r1 = new CompareBinaries.Node(3, bt2_l3, bt2_r4);
    CompareBinaries.Node bt2_root = new CompareBinaries.Node(1, bt2_l1, bt2_r1);

    Assert.assertEquals(false, CompareBinaries.equals(bt1_root, bt2_root));

    bt1_root.value = 35;
    bt2_root.value = 30;
    Assert.assertEquals(false, CompareBinaries.equals(bt1_root, bt2_root));
  }
}

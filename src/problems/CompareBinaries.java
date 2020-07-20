package problems;

/**
 * Write a function to compare whether two binary trees are identical.
 * Identical trees have same key value at each position.
 */
public class CompareBinaries {
  static class Node {
    int value;
    Node left;
    Node right;

    Node(int value, Node left, Node right) {
      this.value = value;
      this.left = left;
      this.right = right;
    }
  }

  public static boolean equals(Node root1, Node root2) {
    if (root1 != null && root2 != null && root1.value == root2.value) {
      if (root1.left == null && root2.left == null && root1.right == null && root2.right == null) {
        return true;
      }
      return equals(root1.left, root2.left) && equals(root1.right, root2.right);
    } else {
      return false;
    }
  }
}



package problems;

/**
 * Write a function to find the middle node of a singly linked list.
 */
public class FindMiddle {
  static class Node {
    int value;
    Node next;

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }


  public static int findMiddle(Node start) {

    if (start == null) return -1;

    Node next = start;
    Node secondNext = start;


    while (secondNext != null && secondNext.next != null && secondNext.next.next != null) {
      next = next.next;
      secondNext = next.next.next;
    }
    return next == null ? -1 : next.value;
  }
}

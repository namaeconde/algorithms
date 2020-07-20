package problems;

public class Arithmetic {

  public static double divide(int a, int b) {
    double quotient = 0;
    double remainder = 0;
    int diff = a;

    while (diff - b >= 0) {
      diff = diff - b;
      quotient = quotient + 1;
    }
    if (diff > 0) {
      int borrow = 0;
      while (diff > 0) {
        borrow = borrow + 10;
        diff--;
      }
      while (borrow - b >= 0) {
        borrow = borrow - b;
        remainder = remainder + 0.1;
      }
    }
    return quotient + remainder;
  }
}

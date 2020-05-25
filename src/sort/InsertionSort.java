package sort;

public class InsertionSort {

  public static int[] sort(int[] input, int[] sorted) {
    // sort in ascending order
    sorted[0] = input[0];
    for(int i=1; i<input.length; i++) {
      int j=i-1;
      while(j>=0 && sorted[j] > input[i]) {
        // move items in sorted array
        sorted[j+1] = sorted[j];
        j--;
      }
      // insert input to sorted array
      sorted[j+1] = input[i];
    }
    return sorted;
  }

  /**
   * If asc = true
   * sort array of integers using insertion sort algorithm in ascending order,
   * otherwise in descending order.
   * O(n^2) time complexity.
   * @param input
   * @param asc
   * @return
   */
  public static int[] sort(int[] input, boolean asc) {
    int[] sorted = null;

    if(input != null && input.length > 0) {
      sorted = new int[input.length];
      if (asc) {
        return sort(input, sorted);
      } else {
        // sort in descending order
        sorted[0] = input[0];
        for(int i=1; i<input.length; i++) {
          int j=i-1;
          while(j>=0 && sorted[j] < input[i]) {
            // move items in sorted array
            sorted[j+1] = sorted[j];
            j--;
          }
          // insert input to sorted array
          sorted[j+1] = input[i];
        }
      }
    }
    return sorted;
  }
}

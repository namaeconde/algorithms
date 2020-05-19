package sort;

public class InsertionSort {

  /**
   * Sort array of integers using insertion sort algorithm.
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

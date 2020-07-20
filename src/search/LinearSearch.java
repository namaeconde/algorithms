package search;

public class LinearSearch {

  /**
   * Given array of integers, find X in the array and return the index.
   * If X is not found in the array return null.
   * Time complexity = O(n) where n = length of the array.
   * @param array
   * @param X
   * @return
   */
    public static Integer searchXInArray(int[] array, int X) {
        if (array != null) {
          for (int i=0; i< array.length; i++) {
            if (array[i] == X) {
              return i;
            }
          }
        }
        return null;
    }
}

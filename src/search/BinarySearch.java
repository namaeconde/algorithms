package search;

public class BinarySearch {

    /**
     * Search X using binary search algorithm,
     * given a sorted array of integers.
     *
     * @param array
     * @param start
     * @param end
     * @param X
     * @return
     */
    public static int search(int[] array, int start, int end, int X) {
        if (start > end) return -1; // End of search not found
        else {
            int mid = (start + end) / 2;
            if (array[mid] == X) {
                return mid;
            } else if (array[mid] > X) {
                // Search in left sub array
                return search(array, start, mid-1, X);
            } else {
                // Search in right sub array
                return search(array, mid+1, end, X);
            }
        }
    }
}

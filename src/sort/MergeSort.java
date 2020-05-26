package sort;

public class MergeSort {

    /**
     * If asc is true sort array of integers in ascending order using merge sort,
     * otherwise sort in descending order.
     * O(nlogn) time complexity.
     *
     * @param input
     * @param asc
     * @return
     */
    public static int[] sort(int[] input, boolean asc) {

        if (asc) {
            return mergeSort(input, 0, input.length-1);
        }
        return null;
    }

    /**
     * Sort array of integers using merge sort.
     * Given with start and end indexes.
     *
     * @param input
     * @param start
     * @param end
     * @return
     */
    private static int[] mergeSort(int[] input, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            // sort left side upto mid
            mergeSort(input, start, mid);

            // sort right side from mid
            mergeSort(input, mid+1, end);

            // merge sorted left - right sides of array
            // copy left side array upto mid
            int leftSubArrayLength = mid-start + 1;
            int[] leftSubArray = new int[leftSubArrayLength];
            for (int i=0; i<leftSubArrayLength; i++) {
                leftSubArray[i] = input[start+i];
            }

            // copy right side array from mid
            int rightSubArrayLength = end-mid;
            int[] rightSubArray = new int[rightSubArrayLength];
            for (int i=0; i<rightSubArrayLength; i++) {
                rightSubArray[i] = input[mid+1+i];
            }
            merge(input, leftSubArray, rightSubArray, start);
        }
        return input;
    }

    /**
     * Merge sorted left and right sub arrays
     * O(n) time complexity
     * @param input
     * @param leftSubArray
     * @param rightSubArray
     * @param start
     * @return
     */
    private static int[] merge(int[] input, int[] leftSubArray, int[] rightSubArray, int start) {

        int leftIndex = 0;
        int rightIndex = 0;
        int i=start;
        int leftSubArrayLength = leftSubArray.length;
        int rightSubArrayLength = rightSubArray.length;
        while (leftIndex < leftSubArrayLength && rightIndex < rightSubArrayLength) {
            if (leftSubArray[leftIndex] <= rightSubArray[rightIndex]) {
                input[i++] = leftSubArray[leftIndex++];
            } else {
                input[i++] = rightSubArray[rightIndex++];
            }
        }

        while (leftIndex < leftSubArrayLength) {
            input[i++] = leftSubArray[leftIndex++];
        }

        while (rightIndex < rightSubArrayLength) {
            input[i++] = rightSubArray[rightIndex++];
        }

        return input;
    }
}

package sort;

public class SelectionSort {

    /**
     * If asc = true
     * sort array of integers in ascending order.
     * O(n^2) time complexity.
     * @param input
     * @param asc
     * @return
     */
    public static int[] sort(int[] input) {
        for (int i=0; i<input.length; i++) {
            int smallest = i;
            for (int j=i+1; j<input.length; j++) {
                if (input[smallest] > input[j]) {
                    // current index is smaller than smallest
                    smallest = j;
                }
            }
            // swap value at index smallest to value at index i;
            int indexValue = input[i];
            input[i] = input[smallest];
            input[smallest] = indexValue;
        }

        return input;
    }

    /**
     * If asc = true
     * sort array of integers in ascending order,
     * otherwise sort in descending order.
     * O(n^2) time complexity.
     * @param input
     * @param asc
     * @return
     */
    public static int[] sort(int[] input, boolean asc) {
        if (asc) {
            return sort(input);
        } else {
            for (int i=0; i<input.length; i++) {
                int biggest = i;
                for (int j=i+1; j<input.length; j++) {
                    if (input[biggest] < input[j]) {
                        // current index is smaller than smallest
                        biggest = j;
                    }
                }
                // swap value at index smallest to value at index i;
                int indexValue = input[i];
                input[i] = input[biggest];
                input[biggest] = indexValue;
            }
            return input;
        }
    }
}

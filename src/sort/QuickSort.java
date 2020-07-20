package sort;

public class QuickSort {

    public static int[] sort(int[] input, int start, int end) {
        if (end <= start) return input;
        int pivotIndex = partition(input, start, end);
        sort(input, start, pivotIndex - 1);
        sort(input, pivotIndex + 1, end);
        return input;
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start]; // pick start element as pivot
        int leftMarker = start + 1;
        int rightMarker = end;

        while (leftMarker <= rightMarker) {
            int left = input[leftMarker];
            int right = input[rightMarker];
            if (left < pivot) {
                leftMarker++;
            } else if (right > pivot) {
                rightMarker--;
            } else {
                // swap right & left
                input[leftMarker++] = right;
                input[rightMarker--] = left;
            }
        }

        input[start] = input[rightMarker];
        input[rightMarker] = pivot;
        return rightMarker;
    }
}
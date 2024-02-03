public class quickSort implements SortingAlgorithm {
    public int[] sort(int[] input) {
        if (input == null || input.length <= 1) {
            return input; // Already sorted
        }
        quickSort(input, 0, input.length - 1);
        return input;
    }

    private static void quickSort (int[] array, int start, int end){
        if (end <= start){
            return;
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array,pivot + 1, end);

    }
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        while (start <= end) {
            if (array[start] < pivot) {
                i++;
                swap(array, i, start);
            }
            start++;
        }
        i++;
        swap(array, i, end);
        return i;
    }
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

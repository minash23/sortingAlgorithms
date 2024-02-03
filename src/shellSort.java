public class shellSort implements SortingAlgorithm{
    public int[] sort(int[] input) {
        int n = input.length;

        // Start with a large gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = input[i];
                int j;
                for (j = i; j >= gap && input[j - gap] > temp; j -= gap) {
                    input[j] = input[j - gap];
                }
                input[j] = temp;
            }
        }
        return input;
    }
}

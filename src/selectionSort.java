public class selectionSort implements SortingAlgorithm {
    public int[] sort(int[] input) {
        for(int i = 0; i < input.length; i++){
            int minIndex = i;
            for (int a = i+1; a < input.length; a++){
                if (input[a] < input[minIndex]){
                    minIndex = a;
                }
            }
            swap(input, i, minIndex);
        }
        return input;
    }
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

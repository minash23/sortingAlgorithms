public class insertionSort implements SortingAlgorithm {
    public int[] sort(int[] input) {
        int temp;
        for (int i = 0; i < input.length; i++){
            int s = i;
            while(s > 0 && input[s] < input[s-1]){
                temp = input[s-1];
                input[s-1] = input[s];
                input[s]= temp;
                s--;
            }
        }
        return input;
    }
}

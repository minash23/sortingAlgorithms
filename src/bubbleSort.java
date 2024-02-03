// BubbleSort.java
public class bubbleSort implements SortingAlgorithm {
    public int[] sort(int[] input) {
        int temp;
        for(int i = 0; i < input.length; i++){
            for (int a = 1; a < input.length-i; a++){
                if(input[a-1] > input[a]){
                    temp = input[a-1];
                    input[a-1] = input[a];
                    input[a]= temp;
                }
            }
        }
        return input;
    }
}

public class mergeSort implements SortingAlgorithm{
    public int[] sort(int[] input) {
        int length = input.length;

        //base case
        if (length <= 1) return input;

        //find midpoint, create lengths of arrays, instantiate i and j holders
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0;
        int j = 0;

        //loop i follows this:  0 -> middle is firstArray, middle->length is secondArray
        for (; i < length; i++){
            if (i < middle){
                leftArray[i] = input[i];
            }
            else{
                rightArray[j] = input[i];
                j++;
            }
        }
        //recursive call to get each array down to length of one
        sort(leftArray);
        sort(rightArray);

        //call to put to arrays back together
        return merge(leftArray, rightArray, input);
    }
    private static int[] merge(int[] leftArray, int[] rightArray, int[] array){
        int[] finalArray = new int[array.length];
        int i = 0; int j = 0; int finCount = 0;

        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] < rightArray[j]){
                finalArray[finCount] = leftArray[i];
                i++;
                finCount++;
            }else{
                finalArray[finCount] = rightArray[i];
                j++;
                finCount++;
            }
        }
        while(i < leftArray.length){
            finalArray[finCount] = leftArray[i];
            i++;
            finCount++;
        }
        while(j < rightArray.length){
            finalArray[finCount] = rightArray[j];
            j++;
            finCount++;
        }
        return finalArray;
    }
}

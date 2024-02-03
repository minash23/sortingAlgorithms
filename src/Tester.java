import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class Tester {

    private SortingAlgorithm sa;
    public Tester(SortingAlgorithm sa) {
        this.sa = sa;
    }

    public long singleTest(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }

        //UNCOMMENT THIS CODE TO MAKE K SORTED ARRAYS WHEN YOU RUN PERFORMANCE
        //generateKSorted(arr);

        long startTime = System.nanoTime();
        sa.sort(arr);
        long endTime = System.nanoTime();

        // nanoseconds to milliseconds
        long duration_in_nanoseconds = (endTime - startTime);
        return TimeUnit.NANOSECONDS.toMillis(duration_in_nanoseconds);
    }

         public static int[] generateKSorted(int[] input) {
            int n = input.length;

            // Start with a large gap, then reduce the gap
            for (int gap = 10; gap < n; gap++) {

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

    public String test(int iterations, int size) {
        double totalTime = 0;
        //run iterations times, then calculate entire time
        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }

        double averageTime = totalTime / iterations;
        String hello = "Sorted " + size + " elements in: " + averageTime + " milliseconds (avg)";
        System.out.println(hello);

        //returning this so i can put it into write.println in performace file
        return hello;
    }

        /*public static void main(String[]args){

        Random r = new Random();
        int low = 10;
        int high = 100;

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = r.nextInt(high-low) + low;
        }

        generateKSorted(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( " ");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
         */

}

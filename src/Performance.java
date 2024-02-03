import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Performance {
    public static void main(String[]args){
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        SortingAlgorithm bubbleSort = new bubbleSort();
        SortingAlgorithm quickSort = new quickSort();
        SortingAlgorithm mergeSort = new mergeSort();
        SortingAlgorithm selectionSort = new selectionSort();
        SortingAlgorithm shellSort = new shellSort();
        SortingAlgorithm insertionSort = new insertionSort();

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("KsortedReport2.txt"));


            writer.println("Insertion Sort:");
            System.out.println("Insertion Sort:");
            Tester tester = new Tester(insertionSort);
            for(int i = 0; i < sizes.length; i++){
                writer.println(tester.test(20, sizes[i]));
            }

            writer.println("Bubble Sort:");
            System.out.println("Bubble Sort:");
            tester = new Tester(bubbleSort);
            for(int i = 0; i < sizes.length; i++){
                writer.println(tester.test(20, sizes[i]));
            }

            writer.println("Merge Sort:");
            System.out.println("Merge Sort:");
            tester = new Tester(mergeSort);
            for(int i = 0; i < sizes.length; i++){
                writer.println(tester.test(20, sizes[i]));
            }

            writer.println("Selection Sort:");
            System.out.println("Selection Sort:");
            tester = new Tester(selectionSort);
            for(int i = 0; i < sizes.length; i++){
                writer.println(tester.test(20, sizes[i]));
            }

            writer.println("Shell Sort:");
            System.out.println("Shell Sort:");
            tester = new Tester(shellSort);
            for(int i = 0; i < sizes.length; i++){
                writer.println(tester.test(20, sizes[i]));
            }

            writer.println("Quick Sort:");
            System.out.println("Quick Sort:");
            tester = new Tester(quickSort);
            for(int i = 0; i < sizes.length; i++){
                writer.println(tester.test(20, sizes[i]));
            }

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Performance {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        SortingAlgorithm bubbleSort = new bubbleSort();
        SortingAlgorithm quickSort = new quickSort();
        SortingAlgorithm mergeSort = new mergeSort();
        SortingAlgorithm selectionSort = new selectionSort();
        SortingAlgorithm shellSort = new shellSort();
        SortingAlgorithm insertionSort = new insertionSort();

        try {
            FileWriter writer = new FileWriter("KsortedReport2.txt");

            writer.write("Insertion Sort:\n");
            Tester tester = new Tester(insertionSort);
            for (int i = 0; i < sizes.length; i++) {
                writer.write(tester.test(20, sizes[i]) + "\n");
            }

            writer.write("Bubble Sort:\n");
            tester = new Tester(bubbleSort);
            for (int i = 0; i < sizes.length; i++) {
                writer.write(tester.test(20, sizes[i]) + "\n");
            }

            writer.write("Merge Sort:\n");
            tester = new Tester(mergeSort);
            for (int i = 0; i < sizes.length; i++) {
                writer.write(tester.test(20, sizes[i]) + "\n");
            }

            writer.write("Selection Sort:\n");
            tester = new Tester(selectionSort);
            for (int i = 0; i < sizes.length; i++) {
                writer.write(tester.test(20, sizes[i]) + "\n");
            }

            writer.write("Shell Sort:\n");
            tester = new Tester(shellSort);
            for (int i = 0; i < sizes.length; i++) {
                writer.write(tester.test(20, sizes[i]) + "\n");
            }

            writer.write("Quick Sort:\n");
            tester = new Tester(quickSort);
            for (int i = 0; i < sizes.length; i++) {
                writer.write(tester.test(20, sizes[i]) + "\n");
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

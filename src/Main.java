
import java.util.EmptyStackException;

import java.util.Random;

public class Main {

    private static int[] arrayCreator() {
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int addNew = random.nextInt();
            array[i] = addNew;
        }
        return array;
    }

    public static void main(String[] args) {
        Main main = new Main();
        var array = arrayCreator();
        System.out.println();
        main.selectionSortRun(array);
        System.out.println();
        var array2 = arrayCreator();
        main.bubbleSortRun(array2);
        System.out.println();
        var array3 = arrayCreator();
        main.insertionSortRun(array3);
        System.out.println();
        var array4 = arrayCreator();
        main.combSortRun(array4);
    }

    public static void printSortedArray(int[] array) {
        System.out.println("\n" + "Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public static void printUnsortedArray(int[] array) {
        System.out.println("\n" + "Unsorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public void selectionSortRun(int[] array) {
        String sortingType = "selection";
        SelectionSort selectionSort = new SelectionSort();
        printUnsortedArray(array);
        long startTime = System.nanoTime();
        selectionSort.sorting(array);
        double estimatedTime = timeEnder(startTime);
        printSortedArray(array);
        sendInfo(estimatedTime, sortingType);
    }

    public void bubbleSortRun(int[] array) {

        String sortingType = "bubble";
        BubbleSort bubbleSort = new BubbleSort();
        printUnsortedArray(array);
        long startTime = System.nanoTime();
        bubbleSort.sorting(array);
        double estimatedTime = timeEnder(startTime);
        printSortedArray(array);
        sendInfo(estimatedTime, sortingType);
    }

    public void insertionSortRun(int[] array) {
        printUnsortedArray(array);
        String sortingType = "insertion";
        InsertionSort insertionSort = new InsertionSort();
        long startTime = System.nanoTime();
        insertionSort.sorting(array);
        double estimatedTime = timeEnder(startTime);
        printSortedArray(array);
        sendInfo(estimatedTime, sortingType);
    }

    public void combSortRun(int[] array) {
        printUnsortedArray(array);
        String sortingType = "comb";
        CombSort combSort = new CombSort();
        long startTime = System.nanoTime();
        combSort.sorting(array);
        double estimatedTime = timeEnder(startTime);
        printSortedArray(array);
        sendInfo(estimatedTime, sortingType);
    }

    public static double timeEnder(long startTime) {
        long endTime = System.nanoTime();
        double estimatedTime = (endTime - startTime);
        return estimatedTime;

    }

    static void sendInfo(double estimatedTime, String sortingType) {
        System.out.println("\n" + "\n" + "----------This is " + sortingType + " sort algorithm. Elapsed time: " + estimatedTime / 1000000 + " milliseconds.---------- ");

    }
}
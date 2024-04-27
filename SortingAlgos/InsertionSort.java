package SortingAlgos;

import java.util.Arrays;

public class InsertionSort {

    private static int[] insertionSorting(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int swappingInt = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swappingInt;
                } else {
                    break; // No need to continue, elements to the left are already sorted
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,56,3,245,9,66};

        System.out.println(Arrays.toString(insertionSorting(array)));
    }

}

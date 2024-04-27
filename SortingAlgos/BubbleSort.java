package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {

    private static int[] bubbleSorting(int[] arr){
        boolean swapped = false;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int swapVariable = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swapVariable;
                    swapped = true;
                }
            }
            if (!swapped){ // means swapped will remain false only and if so !swapped will become true, and it will satisfy the condition and breaks the loop and stops the function
                System.out.println("Broken after iteration number:" + (i+1));
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        //int[] array = {1,3,5,4,2};
        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(bubbleSorting(array)));
    }

}

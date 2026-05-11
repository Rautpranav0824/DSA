package SelectionSort;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        selectionSort(arr);

    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            swap(arr, i, min);
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

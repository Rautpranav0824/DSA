package InsertionSort;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr = {5,7,3,9,1};
        sort(arr);
    }

    public static void sort (int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int num = i;
            while(  num >0 && arr[num] < arr[num-1]){
                swap(arr,num);
                num--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int [] arr , int num){
        int temp = arr[num];
        arr[num] = arr[num-1];
        arr[num-1]=temp;
    }
}

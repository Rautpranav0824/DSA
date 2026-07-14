package BubbleSort;

import java.util.Arrays;


public class bubbleSort {
    public static void main(String[] args) {
     int [] arr = {1,2,3,4,5};
     sort(arr);
     int [] arr2 ={5,4,9,7,1};
     sort(arr2);
    }

    public static void sort (int [] arr){
        int didswap = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j);
                    didswap++;
                }
            }
            if(didswap == 0){
                break ;
            }
            System.out.println("runs");
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }


}

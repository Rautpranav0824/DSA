package arrays;

import java.util.ArrayList;

public class getAllindex {

    static ArrayList<Integer> ans = new ArrayList<>();

    public static void getIndex (int [] arr , int index , int target){

        //base condition
        if(index == arr.length){
            return ;
        }

        if(arr[index] == target){
            ans.add(index);
        }

        getIndex(arr, index+1, target);

    }

    // Returning ArrayList

    public static ArrayList getallIndex (int [] arr , int index , int target , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        getallIndex(arr, index+1, target , list);
        return list;
    }

    // How to do it without passing the arraylist as the parameter
    public  static  ArrayList getallIndex2 (int[] arr , int index , int target){

        ArrayList<Integer> list = new ArrayList<>();

        //base condition
        if(index == arr.length){
            return list;
        }

        //this will add answer to the list which will be valid only for this call
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = getallIndex2(arr,index+1,target);

        list.addAll(ansFromBelow);
        return list;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,3,1,2,3};
        getIndex(arr , 0 , 1);
        System.out.println(ans);

        System.out.println(getallIndex(arr,0,1,new ArrayList<>()));


        System.out.println(getallIndex2(arr,0,1));

    }
}

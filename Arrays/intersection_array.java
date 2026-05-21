import java.util.ArrayList;
import java.util.Arrays;

public class intersection_array {
    public static ArrayList<Integer> intersection ( int [] arr1 , int [] arr2 ){
        int i = 0;
        int j =0 ;
        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

    return ans ;
    }

    public static void main(String[] args) {
        int [] A = {1,2,2,3,3,4,5,6};
        int [] B = {2,3,3,5,6,6,7};

        int[] arr = intersection(A, B).stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
    }
}

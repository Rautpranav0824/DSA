import java.util.TreeSet;

public class union_array{

    public static void union (int[] arr1 , int [] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;

        TreeSet<Integer> union = new TreeSet<>();

        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(union.size()==0 || union.last()!= arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(union.size()==0 || union.last()!= arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i<n1)
            {
                if(union.size()==0 || union.last()!= arr1[i]){
                    union.add(arr1[i]);
            }
            i++;
        }
        while (j<n2)
        {
            if(union.size()==0 || union.last()!= arr2[j]){
                union.add(arr2[j]);
            }
            j++;   
        }

        display(union);
    }

    public static void display (TreeSet<Integer> set){
        System.out.print("The Union is: ");
        for (int num : set) {
        System.out.print(num + " ");
    }
    
    }
    public static void main(String[] args) {
        int [] arr1 = {1,1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5,6};

        union(arr1, arr2);
        
    }
}
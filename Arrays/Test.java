import java.util.Arrays;

 
public class Test {

    static int  arr_global [] = new int[5];
 
    public static void main(String[] args) {
        int arr [] = new int[5];

        System.out.println(arr[1]);
        System.out.println(arr_global[1]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr_global));

    }
}

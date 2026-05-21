public class Largest_element {

    public static int largest (int [] arr){
        int lelement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lelement){
                lelement = arr[i];
            }
        }
        return lelement;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        System.out.print(" largest element is : " + largest(arr));
        
    }
}

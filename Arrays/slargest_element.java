public class slargest_element {

    public static int slargest (int [] arr){
        int lelement = arr[0];
        int selement = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lelement){
                selement = lelement ;
                lelement = arr[i];
            }
            else if (arr[i] > selement ){
                selement = arr[i];
            }
        }

        return selement;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(" Second largest element is : " + slargest(arr));
    }
}

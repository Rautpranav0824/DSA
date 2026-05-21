public class missing_number {
    public static int missing (int [] arr){
        int xor1 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1 ^ i;
        }
        int xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor2 = xor2 ^ arr[i];
        }

        int ans = xor1 ^ xor2;
        return ans ;
    }
}

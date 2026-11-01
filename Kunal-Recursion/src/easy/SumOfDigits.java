package easy;

public class SumOfDigits {
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int num = n/10;
        return n%10 + sum(num);
    }

    public static void main(String[] args) {
        int ans = sum(1234);
        System.out.println(ans);
    }
}

package easy;

public class Count0 {
    static  int cnt = 0;
    static void count0(int n){
        if(n == 0){
            return ;
        }
        int rem = n%10;
        if(rem == 0){
            cnt++;
        }
        count0(n/10);

    }

    public static void main(String[] args) {
        count0(10100);
        System.out.println(cnt);
    }

    // imp note
    // 010101 , 010 , etc
    // any number starting with 0 won't work as in java , numbers starting with 0 are considered as OCTALS
    // soo to make that work u have to take input as STRING , as typecasting doesnt work
    // ex . 01010 octal = 520 int
    // hence output will be 1 not 3
}

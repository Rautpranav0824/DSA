package easy;

public class OnetoN {

    public static void print (int n){

        if(n == 0){
            return;
        }

        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int num = 5;
        print(num);
    }
}

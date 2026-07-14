import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // basically to reverse a number , we have done this already using Collections.reverse but we'll do it using maths

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n = sc.nextInt();

        int revNum = 0 ;
        while(n>0){
            int lastNum = n%10;
            n = n/10 ;
            revNum = (revNum * 10)+lastNum;
        }
        System.out.print(" The reverse number is : ");
        System.out.println(revNum);
    }
}

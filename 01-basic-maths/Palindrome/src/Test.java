import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // basically checking palindrome of a number :- original num == rev of num ( palindrome )
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        int dub = n ;

        int revNum = 0 ;
        while(n>0){
            int lastNum = n%10;
            n = n/10;

            revNum = (revNum * 10)+lastNum;

        }
        System.out.print(" The reverse of original number is  : ");
        System.out.println(revNum);

        if(revNum==dub){
            System.out.println(" IT IS A PALINDROME ");
        }
        else {
            System.out.println(" ITS NOT A PALINDROME ");
        }
    }
}

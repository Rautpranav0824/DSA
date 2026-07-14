import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Armstrong num means --> get every digit from a number , cube it and add all if it matches with original num its armstrong num
        // example --> 371 = 3^3 + 7^3 = 1^3 = 371

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        int dub = n;

        int sum = 0;
        while(n > 0){
            int lastNum = n%10;
            n = n/10;
            sum = sum + ((int) Math.pow(lastNum,3));
        }
        System.out.println(" The sum of the cube of every digit in num is  : " + sum);
        if(sum == dub){
            System.out.println(" IT IS AN ARMSTRONG NUMBER");
        }
        else {
            System.out.println(" NOT AN ARMSTRONG NUMBER ");
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // basically in this we'll extract every digit of the given number
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        int count =0;
        ArrayList<Integer> numbers = new ArrayList<>();
        while ( n > 0){
            int lastnum = n % 10;
            n = n/10;
            count = count + 1 ;
            numbers.add(lastnum);
        }

        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // basically the logic is to run the loop till sqrt(n) cause the its just the repeation of n/i

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 1 ; i <= Math.sqrt(n); i++){
            if(n%i==0){
                numbers.add(i);
                if((n/i) != i){
                    numbers.add((n/i));
                }
            }
        }
        Collections.sort(numbers);
        System.out.println(" The divisors are : " + numbers);
    }
}

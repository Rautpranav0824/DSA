import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // basically prime num = exactly 2 factor 1 & itself and every number has minimum 2 factor 1 and itself

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        int count = 0 ;

        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0){
                count ++ ;
                if((n/i) != i){
                    count++;
                }
            }
        }

        if(count == 2){
            System.out.println(" ITS A PRIME NUMBER ");
        }
        else{
            System.out.println(" NOT A PRIME NUMBER ");
        }

    }
}

import java.util.*;

public class Prime_number_checking {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("IT IS A PRIME NUMBER");
        } else {
            System.out.println("IT IS NOT A PRIME NUMBER");
        }
    }
}
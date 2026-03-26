import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");        // for first number
        int a = sc.nextInt();

        System.out.print("Enter second number:");        //for second number
        int b = sc.nextInt();

        int gcd = 1;
        int min = Math.min(a,b);

        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }

        System.out.println("HCF of "+ a +" and "+ b + " is "+ gcd);

        sc.close();
    }
}
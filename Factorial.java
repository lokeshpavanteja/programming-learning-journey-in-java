import java.util.*;
public class Factorial {
    public static int factorial(int num){
        int fact = 1;
        
        for(int i = 1 ; i <= num ; i++){
            fact = fact * i;
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("please enter a positive number");
        }
        else if(num == 0){
            System.out.println("1");
        }
        else{
            int result = factorial(num);
            System.out.println("Factorial of " + num +" is " +  result );
        }
        sc.close();

    }
}

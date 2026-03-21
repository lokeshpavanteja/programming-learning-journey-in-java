import java.util.Scanner;

public class Reverse_and_Armstrong_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while(num!=0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number :"+reverse);     //TO PRINT THE REVERSE NUMBER

        int temp = original;
        int sum = 0;
        int digits = String.valueOf(original).length();

        while(temp!=0){
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        if(sum == original){
            System.out.println("IT IS AN ARMSTRONG NUMBER");
        }

        else{
            System.out.println("IT IS NOT AN ARMSTRONG NUMBER");
        }
        

    }
}
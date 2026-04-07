import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int original = n;
        n = Math.abs(n);

        int sum = 0;
        int temp = n;

        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        if(sum != 0 && n % sum == 0){
            System.out.println(original + " is harshad number");
        }
        else{
            System.out.println(original + " is not a harshad number");

        }

        sc.close();
    }
}
//Sum of First N Natural Numbers

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is " + sum);

        sc.close();
    }
}

/*
output:
if n = 50

Sum of first 50 natural numbers is 1275

*/

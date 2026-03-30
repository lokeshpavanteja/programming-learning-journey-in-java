// power of a number

import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base:");
        int base = sc.nextInt();

        System.out.print("Enter a exponent:");
        int exponent = sc.nextInt();

        int result = 1;

        for(int i = 1; i <= exponent; i++){
            result = result * base;
        }

        System.out.println(base + " raised to the power of "+exponent + " is "+ result);

        sc.close();
    }
}

/*
output:
Enter a base:5
Enter a exponent:5
5 raised to the power of 5 is 3125

*/
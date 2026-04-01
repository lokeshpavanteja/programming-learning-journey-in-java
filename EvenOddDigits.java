// Count Even and Odd Digits in a Number

import java.util.*;

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();

        num = Math.abs(num); // handle negative numbers

        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10;
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);

        sc.close();
    }
}

/*

OUTPUT:
Enter a number:123495687
Even digits: 4
Odd digits: 5

*/
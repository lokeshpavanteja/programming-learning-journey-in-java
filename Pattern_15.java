// ANOTHER WAY FOR BUTTERFLY PATTERN

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {

            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half (WITHOUT reversing outer loop)
        for (int i = 1; i <= n; i++) {

            int val = n - i;   // key trick

            // left stars
            for (int j = 1; j <= val; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - val); j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= val; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

/*

OUTPUT:
Enter a number: 5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/
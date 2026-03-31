// Palindrome Number Pyramid

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}

/*

output:
Enter a number: 5
    1
   121
  12321
 1234321
123454321
*/
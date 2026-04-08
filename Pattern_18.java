// Hollow Diamond

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Left spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // First star
            System.out.print("*");

            // Inner spaces + second star
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Left spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // First star
            System.out.print("*");

            // Inner spaces + second star
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

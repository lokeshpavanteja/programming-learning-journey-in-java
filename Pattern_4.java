// Inverted Full Pyramid

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i - 1 ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2 * (n - i) + 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
output:
if n = 5

*********
 *******
  *****
   ***
    *
    
*/

// Number Increasing Triangle

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

/*
output:
if n = 5

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

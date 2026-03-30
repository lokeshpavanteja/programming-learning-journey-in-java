// Reverse Number Triangle

import java.util.Scanner;

public class Pattern_12{
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
output:
Enter a number:5
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1

*/
// Floyd’s Triangle

import java .util.Scanner;

public class Pattern_8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int number = 1;

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
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
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
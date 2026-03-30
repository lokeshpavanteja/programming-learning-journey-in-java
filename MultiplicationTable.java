// Multiplication Table Generator

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println( n +" x "+ i + " = " +(n * i));
        }

        sc.close();
    }
}

/*

OUTPUT:
Enter a number:15
15 x 1 = 15
15 x 2 = 30
15 x 3 = 45
15 x 4 = 60
15 x 5 = 75
15 x 6 = 90
15 x 7 = 105
15 x 8 = 120
15 x 9 = 135
15 x 10 = 150

*/
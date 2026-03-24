import java.util.Scanner;
public class Pattern_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){        //for number of rows
            
            for(int j = 1; j <= n-i; j++){  //for printing of spaces
                System.out.print(" ");
            }

            for(int j = 1; j <= 2*i-1; j++){    //for printing of stars
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // patterns 1

        System.out.print("Enter a number:");
        int n =sc.nextInt();
        System.out.println("The Right Triangle Stars pattern is :");
        for (int i = 1 ; i <= n ; i++){         // printing of number of rows
            for(int j = 1 ; j <= i ; j++){      // printing of number of stars
                System.out.print(" * ");
            }
            System.out.println();
        }

        //patterns 2
        System.out.println("The reverse pattern for that one is :");
        for(int i = n ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int num = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num = num * (i - j) / j;
            }
            System.out.println();
        }

        sc.close();
    }
}

/*

OUTPUT:
Enter a number:5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

*/

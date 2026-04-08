import java.util.Scanner;

public class Pattern_19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 3; i++) {   // only 3 rows

            for (int j = 1; j <= n; j++) {

                if ((i == 1 && j % 4 == 3) ||
                    (i == 2 && (j % 4 == 2 || j % 4 == 0)) ||
                    (i == 3 && j % 4 == 1)) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
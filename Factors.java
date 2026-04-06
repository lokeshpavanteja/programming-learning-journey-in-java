import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find the factors of it:");
        int n = sc.nextInt();
        System.out.println("the factors of " + n + " is ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
            sc.close();
        }
    }
}
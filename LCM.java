import java.util.*;

public class LCM {

    public static int findHCF(int a, int b) {
        int hcf = 1;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = findHCF(a, b);

        int lcm = (a * b) / hcf;

        System.out.println("LCM of " + a + " and " + b + " is " + lcm);

        sc.close();
    }
}
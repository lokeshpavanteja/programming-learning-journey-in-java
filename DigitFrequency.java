import java.util.Scanner;

public class DigitFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        System.out.print("Enter a digit to check frequency:");
        int target = sc.nextInt();

        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit == target) {
                count++;
            }

            n = n / 10;
        }

        System.out.println("Digit " + target + " appears " + count + " times ");
        sc.close();
    }
}
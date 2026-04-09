import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int divisor = 1;

        while (temp > 0) {
            divisor *= 10;
            temp = temp / 10;
        }

        if (square % divisor == num) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int EvenSum = 0;
        int OddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                EvenSum += arr[i];
            } else {
                OddSum += arr[i];
            }
        }

        System.out.println("Sum of even elements: " + EvenSum);
        System.out.println("Sum of odd elements: " + OddSum);

        sc.close();
    }
}
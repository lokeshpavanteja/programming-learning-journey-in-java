import java.util.Scanner;

public class LargestOddNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largestOdd = -1;

        // Find largest odd number
        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 != 0) {

                if (largestOdd == -1 || arr[i] > largestOdd) {
                    largestOdd = arr[i];
                }
            }
        }

        // Output
        if (largestOdd == -1) {
            System.out.println("No odd number found");
        } else {
            System.out.println("Largest Odd Number = " + largestOdd);
        }

        sc.close();
    }
}
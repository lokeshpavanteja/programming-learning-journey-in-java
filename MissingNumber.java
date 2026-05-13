import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Expected range is 1 to n+1
        int totalNumbers = n + 1;

        // Formula for sum of 1 to N
        int expectedSum = totalNumbers * (totalNumbers + 1) / 2;

        // Actual array sum
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        // Missing number
        int missingNumber = expectedSum - actualSum;

        // Output
        System.out.println("Missing Number: " + missingNumber);

        sc.close();
    }
}
import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target element
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int count = 0;

        // Count occurrences
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // Output
        System.out.println("Occurrences of " + target + " = " + count);

        sc.close();
    }
}
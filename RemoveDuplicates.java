import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input sorted array
        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Unique position pointer
        int uniqueIndex = 0;

        // Traverse array
        for (int i = 1; i < n; i++) {

            // If current element is different
            if (arr[i] != arr[uniqueIndex]) {

                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        // Display unique elements
        System.out.println("Array after removing duplicates:");

        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
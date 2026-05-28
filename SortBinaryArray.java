import java.util.Scanner;

public class SortBinaryArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input binary array
        System.out.println("Enter array elements (0s and 1s):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Pointer for placing zeros
        int left = 0;

        // Traverse array
        for (int i = 0; i < n; i++) {

            // If element is 0
            if (arr[i] == 0) {

                // Swap current element with left position
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;

                left++;
            }
        }

        // Display sorted array
        System.out.println("Sorted Binary Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
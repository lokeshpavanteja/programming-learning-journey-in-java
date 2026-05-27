import java.util.Scanner;

public class SeparateEvenOdd {

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

        int left = 0;
        int right = n - 1;

        // Separate even and odd numbers
        while (left < right) {

            // Move left if even
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            // Move right if odd
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }

            // Swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Display result
        System.out.println("Array after separation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
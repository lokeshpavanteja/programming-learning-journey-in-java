import java.util.Scanner;

public class MoveZerosToEnd {

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

        // Position for non-zero elements
        int position = 0;

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        // Fill remaining positions with zeros
        while (position < n) {
            arr[position] = 0;
            position++;
        }

        // Display result
        System.out.println("Array after moving zeros:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
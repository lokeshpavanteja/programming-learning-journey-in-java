import java.util.Scanner;

public class LeftRotateByOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store first element
        int first = arr[0];

        // Shift elements left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place first element at end
        arr[n - 1] = first;

        System.out.println("Array after left rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
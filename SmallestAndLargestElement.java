import java.util.Scanner;

public class SmallestAndLargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is both smallest and largest
        int min = arr[0];
        int max = arr[0];

        // Single traversal
        for(int i = 1; i < n; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // Output
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);

        sc.close();
    }
}
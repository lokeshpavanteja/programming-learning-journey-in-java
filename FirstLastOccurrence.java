import java.util.Scanner;

public class FirstLastOccurrence {

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

        // Input target element
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int first = -1;
        int last = -1;

        // Traversing array
        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {

                // Store first occurrence only once
                if (first == -1) {
                    first = i;
                }

                // Keep updating last occurrence
                last = i;
            }
        }

        // Output
        System.out.println("First Position: " + first);
        System.out.println("Last Position: " + last);

        sc.close();
    }
}
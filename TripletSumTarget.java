import java.util.Scanner;
import java.util.Arrays;

public class TripletSumTarget {

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

        // Input target
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Sort array
        Arrays.sort(arr);

        boolean found = false;

        // Fix one element
        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {

                    System.out.println("Triplet Found: "
                            + arr[i] + " "
                            + arr[left] + " "
                            + arr[right]);

                    found = true;
                    break;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No Triplet Found");
        }

        sc.close();
    }
}
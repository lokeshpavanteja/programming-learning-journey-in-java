import java.util.Scanner;
import java.util.Arrays;

public class PairWithDifference {

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

        // Input difference
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        // Sort array
        Arrays.sort(arr);

        int left = 0;
        int right = 1;

        boolean found = false;

        while (right < n) {

            int diff = arr[right] - arr[left];

            if (diff == k && left != right) {
                found = true;
                break;
            } 
            else if (diff < k) {
                right++;
            } 
            else {
                left++;
            }

            if (left == right) {
                right++;
            }
        }

        if (found) {
            System.out.println("Pair Found");
        } else {
            System.out.println("Pair Not Found");
        }

        sc.close();
    }
}
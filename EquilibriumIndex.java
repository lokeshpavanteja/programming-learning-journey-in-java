import java.util.*;

public class EquilibriumIndex {

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;

        // Step 1: Find total sum
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Step 2: Traverse and check equilibrium
        for (int i = 0; i < arr.length; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i; // equilibrium index found
            }

            leftSum += arr[i];
        }

        return -1; // no equilibrium index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findEquilibriumIndex(arr);

        if (result != -1) {
            System.out.println("Equilibrium Index: " + result);
        } else {
            System.out.println("No Equilibrium Index found");
        }
    }
}
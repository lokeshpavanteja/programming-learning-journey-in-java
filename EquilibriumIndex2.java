import java.util.Scanner;

public class EquilibriumIndex {

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

        // Find total sum
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        int equilibriumIndex = -1;

        // Find equilibrium index
        for (int i = 0; i < n; i++) {

            int rightSum = totalSum - arr[i] - leftSum;

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }

            leftSum += arr[i];
        }

        // Output
        if (equilibriumIndex == -1) {
            System.out.println("No Equilibrium Index Found");
        } else {
            System.out.println("Equilibrium Index = " + equilibriumIndex);
        }

        sc.close();
    }
}
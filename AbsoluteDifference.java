import java.util.Scanner;

public class AbsoluteDifference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Please enter at least one element.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                evenSum += arr[i];
            }
            else{
                oddSum += arr[i];
            }
        }

        int absoluteDifference = Math.abs(evenSum - oddSum);
        System.out.println("The Absolute Difference is: " + absoluteDifference);
        sc.close();
    }
}
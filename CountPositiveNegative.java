import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 0){
            System.out.print("Please enter at least one number.");
            return;
        }

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int PositiveCount = 0;
        int NegativeCount = 0;

        for(int i = 0; i < n; i++){
            if (arr[i] > 0){
                PositiveCount++;
            }else if(arr[i] < 0){
                NegativeCount++;
            }
        }
        System.out.println("Positive elements: " + PositiveCount);
        System.out.println("Negative elements: " + NegativeCount);

        sc.close();
    }
}

import java.util.Scanner;

public class CountGreaterThanAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;
        int count = 0;

        for(int i = 0; i < n; i++){
            if (arr[i] > avg){
                count++;
            }
        }

            System.out.println("Average: " + avg);
            System.out.println("Count of elements greater than average: " + count);

            sc.close();

    }
}

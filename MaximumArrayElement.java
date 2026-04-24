import java.util.Scanner;

public class MaximumArrayElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to enter:");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Array must have atleast one element:");
            return;
        }

        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max  = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }


        }

        System.out.println("The maximum in the array is:" + max);

        sc.close();
    }
}
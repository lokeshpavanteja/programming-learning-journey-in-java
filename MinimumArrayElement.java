import java.util.Scanner;

public class MinimumArrayElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Array must have atleast one element");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Please enter the elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("The minimum element in given array is: " + min);
        sc.close();
    }
}
import java.util.Scanner;

public class MinAndMaxElementInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        while(true){
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        if (n > 0){
            break;
        }
        else{
            System.out.println("please enter at least one element.");
        }
    }
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];


        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        sc.close();
    }
}
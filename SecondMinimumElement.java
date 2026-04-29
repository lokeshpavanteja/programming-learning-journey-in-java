import java.util.Scanner;

public class SecondMinimumElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;

        while(true){
        
            System.out.println("Enter the number of elements: ");
            n = sc.nextInt();

            if(n >= 2){
                break;
            }
            else{
                System.out.println("Please enter at least two elements.");
            }
        }
        
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        int SecSmallestElement = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] != min && arr[i] < SecSmallestElement){
                SecSmallestElement = arr[i];
            }
        }

        System.out.println("The second smallest element is " + SecSmallestElement);
        sc.close();
    }
}

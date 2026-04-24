import java.util.Scanner;

public class CountEvenNumbersArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of elements: ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Please enter elements that are greater than zero");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();    
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }

        System.out.println("The number of even elements in the array is: " + count);
        sc.close();
    }
}
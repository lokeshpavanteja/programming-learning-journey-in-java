import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array elements:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int result = linearSearch(arr, key);

        if(result != -1){
            System.out.print("element found at index :" + result);
        }
        else{
            System.out.print("Elemnt not found!");
        }

        sc.close();
    }
}

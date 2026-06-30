import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int key){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key >= arr[mid]){
                return left = mid + 1;       
            }
            else{
                return right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array elements in sorted order:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element:");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if(result != -1){
            System.out.println("Element found at index : " + result);
        }
        else{
            System.out.println("Element not found!");
        }

        sc.close();
        } 
}

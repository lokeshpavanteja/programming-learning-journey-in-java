import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter at least one element.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The reverse of the array is:");
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
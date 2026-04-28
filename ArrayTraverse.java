import java.util.*;

class ArrayTraverse {
    
    public static void arrayTraversal(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Array creation
        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Function call
        arrayTraversal(arr);

        sc.close();
    }
}
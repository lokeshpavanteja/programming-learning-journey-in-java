import java.util.*;

public class CountFrequency {
    public static void countFrequency(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements are you go to enter?:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Count frequency:");
        countFrequency(arr);
    
        sc.close();
    }
}

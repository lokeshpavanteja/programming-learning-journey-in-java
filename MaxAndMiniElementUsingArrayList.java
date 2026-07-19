import java.util.*;

public class MaxAndMiniElementUsingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("How many elements are you going to enter? : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("The array elements are :" + list);

        System.out.println("The maximum elements in the array list is : " + Collections.max(list));
        System.out.println("The minimum elements in the array list is : " + Collections.min(list));

        sc.close();
    }
}

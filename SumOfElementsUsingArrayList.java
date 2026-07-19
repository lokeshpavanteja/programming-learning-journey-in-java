import java.util.*;

public class SumOfElementsUsingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("How many elements are you going to enter? : ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " elements:");

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.print("Elements in the ArrayList:");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }

        int sum = 0;

        System.out.println("Sum of the given elements is : ");

        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }

        System.out.println(sum);

        sc.close();
    }
}
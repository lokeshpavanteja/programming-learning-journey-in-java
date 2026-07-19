import java.util.*;

public class ReverseAnArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("How many elements are you going to enter? : ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " elements : ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }    

        System.out.println("The array elements are : " + list);

        System.out.println("The reversed array list is : ");
        Collections.reverse(list);

        System.out.println(list);

        sc.close();
    }
}

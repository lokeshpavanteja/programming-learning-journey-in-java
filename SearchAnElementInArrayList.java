import java.util.*;

public class SearchAnElementInArrayList {
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

        System.out.print("Enter which element to find : ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == key){
                System.out.println("Element found at the index " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element not found.");
        }

        sc.close();

    }
}

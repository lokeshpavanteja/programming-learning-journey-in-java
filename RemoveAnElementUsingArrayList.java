import java.util.*;

public class RemoveAnElementUsingArrayList{
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

        System.out.print("Enter which element to remove : ");
        int remove = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == remove){
                System.out.println("Element found at index : " + i);
                list.remove(i);
                found = true;
                break;
            }
        }
        System.out.println("The element is removed.");
        System.out.println(list);

        sc.close();


    }
}
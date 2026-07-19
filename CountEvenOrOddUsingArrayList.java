import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountEvenOrOddUsingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter how may elements are you going to enter? : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println("The elements in the array list are : " + list);
        int EvenCount = 0;
        int OddCount = 0;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                EvenCount++;
            }
            else{
                OddCount++;
            }
        }
        System.out.println("The even count is : " + EvenCount);
        System.out.println("The odd count is : " + OddCount);
        sc.close();
    }
}

import java.util.*;

public class ArrayListProblem {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println(numbers.getLast());
        System.out.println(numbers.getClass());
        numbers.clear();
        int n;
        System.out.println(numbers);
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }
}

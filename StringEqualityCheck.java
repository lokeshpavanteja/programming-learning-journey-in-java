import java.util.Scanner;

public class StringEqualityCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        // Input second string
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check equality
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        sc.close();
    }
}
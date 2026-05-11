import java.util.Scanner;

public class StringPalindrome {

    // Method to reverse a string manually
    public static String reverseString(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        // Input second string
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Reverse both strings
        String rev1 = reverseString(str1);
        String rev2 = reverseString(str2);

        // Display reversed strings
        System.out.println("Reversed first string: " + rev1);
        System.out.println("Reversed second string: " + rev2);

        // Check palindrome for first string
        if (str1.equals(rev1)) {
            System.out.println("First string is a palindrome");
        } else {
            System.out.println("First string is not a palindrome");
        }

        // Check palindrome for second string
        if (str2.equals(rev2)) {
            System.out.println("Second string is a palindrome");
        } else {
            System.out.println("Second string is not a palindrome");
        }

        sc.close();
    }
}
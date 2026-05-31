import java.util.Scanner;

public class PalindromeUsingStringBuilder {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String originalString = sc.nextLine();

        // Convert to lowercase
        originalString = originalString.toLowerCase();

        // Create StringBuilder object
        StringBuilder reversedString =
                new StringBuilder(originalString);

        // Reverse the string
        reversedString.reverse();

        // Compare original and reversed strings
        if (originalString.equals(reversedString.toString())) {

            System.out.println("Palindrome");

        } else {

            System.out.println("Not Palindrome");
        }

        // Close scanner
        sc.close();
    }
}
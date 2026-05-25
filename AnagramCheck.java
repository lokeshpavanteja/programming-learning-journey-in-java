import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking first string input
        System.out.print("Enter first string: ");
        String firstString = sc.nextLine();

        // Taking second string input
        System.out.print("Enter second string: ");
        String secondString = sc.nextLine();

        // Converting to lowercase
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        // Removing spaces
        firstString = firstString.replaceAll("\\s+", "");
        secondString = secondString.replaceAll("\\s+", "");

        // Checking lengths first
        if (firstString.length() != secondString.length()) {

            System.out.println("Not Anagrams");
        }
        else {

            // Converting strings to character arrays
            char[] firstArray = firstString.toCharArray();
            char[] secondArray = secondString.toCharArray();

            // Sorting both arrays
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            // Comparing sorted arrays
            if (Arrays.equals(firstArray, secondArray)) {

                System.out.println("Anagrams");
            }
            else {

                System.out.println("Not Anagrams");
            }
        }

        // Closing scanner
        sc.close();
    }
}
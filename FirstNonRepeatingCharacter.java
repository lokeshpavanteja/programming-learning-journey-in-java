import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Variable to check whether unique character exists
        boolean found = false;

        // Outer loop picks one character
        for (int i = 0; i < text.length(); i++) {

            // Current character
            char currentCharacter = text.charAt(i);

            // Frequency counter
            int count = 0;

            // Inner loop checks frequency
            for (int j = 0; j < text.length(); j++) {

                // Comparing characters
                if (currentCharacter == text.charAt(j)) {

                    count++;
                }
            }

            // If frequency is 1
            if (count == 1) {

                System.out.println(
                    "First non-repeating character: "
                    + currentCharacter
                );

                found = true;

                // Stop after finding first unique character
                break;
            }
        }

        // If no unique character exists
        if (!found) {

            System.out.println("No unique character");
        }

        // Closing scanner
        sc.close();
    }
}
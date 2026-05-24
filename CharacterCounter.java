import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Variables to store counts
        int alphabets = 0;
        int digits = 0;
        int specialCharacters = 0;

        // Traversing each character
        for (int i = 0; i < text.length(); i++) {

            // Getting character using charAt()
            char ch = text.charAt(i);

            // Checking alphabet
            if (Character.isLetter(ch)) {

                alphabets++;

            }

            // Checking digit
            else if (Character.isDigit(ch)) {

                digits++;

            }

            // Remaining are special characters
            else {

                specialCharacters++;
            }
        }

        // Printing results
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);

        // Closing scanner
        sc.close();
    }
}
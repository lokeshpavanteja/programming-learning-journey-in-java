import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Creating StringBuilder object
        StringBuilder reversedText = new StringBuilder(text);

        // Reversing the string
        reversedText.reverse();

        // Printing reversed string
        System.out.println("Reversed String: " + reversedText);

        // Closing scanner
        sc.close();
    }
}
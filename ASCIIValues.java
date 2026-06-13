import java.util.Scanner;

public class ASCIIValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Traversing the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Converting character to ASCII value
            int asciiValue = (int) ch;

            System.out.println(ch + " -> " + asciiValue);
        }

        sc.close();
    }
}
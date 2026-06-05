import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Handle empty string
        if (text.length() == 0) {
            System.out.println("Empty String");
            return;
        }

        StringBuilder compressedString = new StringBuilder();

        int count = 1;

        // Traverse the string
        for (int i = 1; i < text.length(); i++) {

            // If current character is same as previous
            if (text.charAt(i) == text.charAt(i - 1)) {

                count++;

            } else {

                // Append character and count
                compressedString.append(text.charAt(i - 1));
                compressedString.append(count);

                // Reset count
                count = 1;
            }
        }

        // Append last character group
        compressedString.append(text.charAt(text.length() - 1));
        compressedString.append(count);

        System.out.println("Compressed String: " + compressedString);

        sc.close();
    }
}
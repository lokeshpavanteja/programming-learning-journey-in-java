import java.util.Scanner;

public class AllSubstrings {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("All possible substrings are:");

        // Outer loop for starting index
        for (int start = 0; start < text.length(); start++) {

            // Inner loop for ending index
            for (int end = start + 1; end <= text.length(); end++) {

                // Extract substring
                String part = text.substring(start, end);

                // Print substring
                System.out.println(part);
            }
        }

        // Closing scanner
        sc.close();
    }
}
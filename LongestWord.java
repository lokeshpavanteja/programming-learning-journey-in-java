import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking sentence input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Splitting sentence into words
        String[] words = sentence.split("\\s+");

        // Assuming first word as longest initially
        String longestWord = words[0];

        // Traversing all words
        for (int i = 1; i < words.length; i++) {

            // Comparing word lengths
            if (words[i].length() > longestWord.length()) {

                longestWord = words[i];
            }
        }

        // Printing result
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());

        // Closing scanner
        sc.close();
    }
}
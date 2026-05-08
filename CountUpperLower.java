import java.util.Scanner;

public class CountUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int upperCount = 0;
        int lowerCount = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }

        // Display results
        System.out.println("Total Uppercase Letters: " + upperCount);
        System.out.println("Total Lowercase Letters: " + lowerCount);

        sc.close();
    }
}
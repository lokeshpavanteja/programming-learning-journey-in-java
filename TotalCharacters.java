import java.util.Scanner;

public class TotalCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        if (s.isEmpty()){
            System.out.println("You entered an empty string.");
        }else{
        System.out.print("The length of String is: " + s.length());
        }
        sc.close();
    }
}

import java.util.Scanner;

public class user_input_swicth3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-3): ");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("You chose One");
                break;
            case 2:
                System.out.println("You chose Two");
                break;
            case 3:
                System.out.println("You chose Three");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

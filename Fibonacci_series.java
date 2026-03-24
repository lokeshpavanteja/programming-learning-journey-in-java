import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;

        System.out.println("The fibonacci series of " + n + " is:");
        if(n <= 0){
            System.out.println("Enter a positive number!");
        }
        else if (n == 1){
            System.out.println(a);
        }
        else{
            System.out.print(a + " " + b + " ");

            for (int i = 3; i <= n; i++){
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}

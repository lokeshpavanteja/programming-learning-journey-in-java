import java.util.Scanner;
public class Count_digit{
    public static int countdigits(int number){
        number = Math.abs(number);           //FOR HANDLING OF NEGITIVE NUMBERS
        if(number==0){
            return 1;
        }
        int count = 0;
        while(number>0){
            number = number/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number:");

        num = sc.nextInt();

        int result = countdigits(num);
        System.out.println("Number of digits is"+" "+result);
        sc.close();
    }
}
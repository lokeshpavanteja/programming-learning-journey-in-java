public class Controlstatements {
    public static void main(String[] args){
        int a = 10,b = 20,c = 25;
        if(a > b && a > c){
            System.out.println(a + "largest is a");
        }
        else if(b > a && b > c){
            System.out.println(b + "largest is b");
        }
        else {
            System.out.println(c + "  largest is c");
        }
    }
}

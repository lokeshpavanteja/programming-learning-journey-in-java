class Calculator{
    void add(int a, int b){
        System.out.println("the sum of two numbers is : " + (a + b));
    }
    void add(int a , int b , int c){
        System.out.println("the sum of three numbers is : " + (a + b + c));
    }
}

public class MethodOverLoading{
    public static void main(String[] args) {
        
        Calculator c1 = new Calculator();

        c1.add(10,20);
        c1.add(10,20,30);

    }
}
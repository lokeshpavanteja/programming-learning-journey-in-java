public class Swicth {
    public static void main(String[] args) {
        int day = 6;
        switch(day){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7-> System.out.println("weekends");
            default -> System.out.println("Invalid");
        }
    }
}

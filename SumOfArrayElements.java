public class SumOfArrayElements {

    public static int calculateSum(int[] arr){

        if(arr == null || arr.length == 0){
            return 0;
        }
        int sum = 0;
        
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 25, 30, 45, 90 };
        
        int result = calculateSum(arr);

        System.out.println("Sum of array elements is : " + result);
    }
}

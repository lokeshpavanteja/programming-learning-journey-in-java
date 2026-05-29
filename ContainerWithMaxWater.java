import java.util.Scanner;

public class ContainerWithMaxWater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of heights: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        // Input heights
        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        int maxArea = 0;

        while (left < right) {

            int width = right - left;

            int minHeight;
            if (height[left] < height[right]) {
                minHeight = height[left];
            } else {
                minHeight = height[right];
            }

            int area = width * minHeight;

            if (area > maxArea) {
                maxArea = area;
            }

            // Move the pointer with smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum Water Stored = " + maxArea);

        sc.close();
    }
}
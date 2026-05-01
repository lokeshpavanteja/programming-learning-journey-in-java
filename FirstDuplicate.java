//Brute Force

import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if (arr[i] == arr[j]){
                    System.out.println("First duplicate elements is " + arr[i]);
                    return;
                }
            }
        }

        System.out.println("No duplicate element found.");
    }
}

/*
This brute force approach finds:

First element that has a duplicate

NOT:

Element whose duplicate appears earliest
 */
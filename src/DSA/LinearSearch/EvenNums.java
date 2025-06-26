package DSA.LinearSearch;

import java.util.Scanner;

public class EvenNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter:");
        int n=in.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter"+n+"numbers");
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }

        System.out.println(even(nums));

    }
    static int even(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}

package DSA.Sorting;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums)); // Output: [0,0,1,1,2,2]
    }

    static void sortColors(int[] nums) {
        int low = 0;             // boundary for 0s
        int mid = 0;             // current index
        int high = nums.length - 1; // boundary for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;  // 1s are already in correct place
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--; // don't move mid here, because swapped value needs checking
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

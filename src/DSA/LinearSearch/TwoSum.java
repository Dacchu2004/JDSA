package DSA.LinearSearch;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums ={11,2,15,7};
        int target = 9;

        int[] twoSum=sum(nums,target);
        System.out.println(Arrays.toString(twoSum));
    }

    static int[] sum(int[] nums,int target){
        int sum = 0;
        for (int num1 = 0; num1 < nums.length; num1++) {
            if (nums[num1] < target) {
                for (int num2 = num1 + 1; num2 < nums.length; num2++) {
                    if (nums[num2] < target) {
                        if (nums[num1] + nums[num2] == target) {
                            return new int[]{num1, num2};
                        }
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }
}

package DSA.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

//finding the start and end of the target in an array
public class S_and_E {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target =7;
        int[] ans ={-1,1};

        int start = searchRange(nums,target,true);
        int end=searchRange(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        System.out.println(Arrays.toString(ans));
    }

    static int searchRange(int[] nums, int target,boolean searchStart){
        int ans = -1;
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else {
                ans=mid;
                if(searchStart){
                    end = mid -1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

//// LEET CODE VERSION
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int[] ans = {-1, -1};
//
//        int start = search(nums, target, true);
//        int end = search(nums, target, false);
//
//        ans[0] = start;
//        ans[1] = end;
//
//        return ans;
//    }
//
//    private int search(int[] nums, int target, boolean findStartIndex) {
//        int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < nums[mid]) {
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                ans = mid;
//                if (findStartIndex) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//    }
//}

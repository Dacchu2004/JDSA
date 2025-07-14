package DSA.BinarySearch;

public class MinInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        // If the array is not rotated
        if (nums[left] < nums[right]) return nums[left];

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum is in the right half
                left = mid + 1;
            } else {
                // Minimum could be at mid or to the left of mid
                right = mid;
            }
        }

        return nums[left]; // or nums[right], both point to the min
    }
}


package DSA.SlidingWindow;

public class MaxAvg {
    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }
    static double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;

        // First window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;

        //Slide the window
        for (int j = k; j < nums.length; j++) {
            sum += nums[j] - nums[j - k];  // add new, remove old
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k; // average
    }
}

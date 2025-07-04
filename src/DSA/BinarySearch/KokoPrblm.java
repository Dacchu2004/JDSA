package DSA.BinarySearch;

public class KokoPrblm {

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);
    }

    // Method to find the minimum eating speed using binary search
    static int minEatingSpeed(int[] piles, int h) {
        int start = 1;  // Minimum possible speed
        int end = getMax(piles);  // Maximum pile size

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if Koko can finish all bananas at speed 'mid'
            if (canFinish(piles, mid, h)) {
                // Try slower speed
                end = mid;
            } else {
                // Need faster speed
                start = mid + 1;
            }
        }
        return start;  // This is the minimum valid speed
    }

    // Helper to check if Koko can finish all bananas at speed 'k' within 'h' hours
    static boolean canFinish(int[] piles, int k, int h) {
        int time = 0;

        for (int pile : piles) {
            time += (pile + k - 1) / k;  // Equivalent to Math.ceil(pile / k)
        }

        return time <= h;
    }

    // Helper to find the maximum pile (used as upper bound)
    static int getMax(int[] piles) {
        int max = Integer.MIN_VALUE;

        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }
}

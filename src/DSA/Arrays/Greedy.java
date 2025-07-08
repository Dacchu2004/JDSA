package DSA.Arrays;
//can place flower(605)
public class Greedy {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};  // Example input
        int n = 1;                          // Number of flowers to plant

        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println("Can place " + n + " flowers: " + result);
    }

    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1 || flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;  // Place a flower
                    n--;

                    if (n == 0) return true;  // All required flowers placed
                }
            }
        }

        return n <= 0;
    }
}

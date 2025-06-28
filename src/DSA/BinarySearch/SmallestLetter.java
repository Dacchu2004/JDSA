package DSA.BinarySearch;

//smallest character greater than the target
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = { 'c' , 'e', 'j', 'k' };
        char target='z';

        System.out.println(nextGreatLetter(letters,target));
    }

    public static char nextGreatLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
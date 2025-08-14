package DSA.SlidingWindow;

import java.util.Set;

//using sets
public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }
    static int maxVowels(String s, int k) {
        int count=0;
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        for(int i=0;i<k;i++){
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        int max=count;

        for (int j = k; j < s.length(); j++) {
            if (vowels.contains(s.charAt(j))) {
                count++;
            }
            if(vowels.contains(s.charAt(j-k))){
                count--;
            }
            max = Math.max(max, count);
            if(max==k){
                return max;
            }
        }
        return max;
    }
    //not using sets
    public int maxVowels1(String s, int k) {
        int count = 0;
        String vowels = "aeiou";

        // First window
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(Character.toLowerCase(s.charAt(i))) >= 0) {
                count++;
            }
        }
        int max = count;

        // Slide the window
        for (int j = k; j < s.length(); j++) {
            if (vowels.indexOf(Character.toLowerCase(s.charAt(j))) >= 0) {
                count++;
            }
            if (vowels.indexOf(Character.toLowerCase(s.charAt(j - k))) >= 0) {
                count--;
            }
            max = Math.max(max, count);
            if (max == k) return max;
        }
        return max;
    }

}

package DSA.String;

public class ReverseWords {
}
// My version

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");  // split by one or more spaces
        int left = 0, right = words.length - 1;

        // reverse the array of words
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }


        return String.join(" ", words);
    }
}

//more optimized version

class Solution2 {
    public String reverseWords(String s) {
        String [] words = s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString();

    }
}

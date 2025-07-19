package DSA.String;

public class MergeStringAlternatively {
    public String mergeAlternately(String word1, String word2) {

        int start1= 0;
        int start2=0;
        StringBuilder res = new StringBuilder();
        while(start1<word1.length() || start2<word2.length()){
            if(start1<word1.length()){
                res.append(word1.charAt(start1));
                start1++;
            }
            if(start2<word2.length()){
                res.append(word2.charAt(start2));
                start2++;
            }
        }
        return res.toString();
    }
}

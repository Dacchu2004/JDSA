package DSA.Recurrsion;

public class ReverseString {
    public void reverseString(char[] s) {
        recurs(s, 0, s.length - 1); //initial start=0; end=s.length-1
    }

    void recurs(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        // Swapping
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        // Recursive call
        recurs(s, start+1, end-1);// start++ and end--;
    }
}


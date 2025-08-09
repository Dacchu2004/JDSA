package DSA.StringRecursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseq1("","abc"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1)); // strings are immutable so the up.substring will always be creating an new object
        subseq(p,up.substring(1));
    }

    //returning an arraylist of string but passing the arraylist inside the function body itself
    static ArrayList<String> subseq1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq1(p+ch,up.substring(1));
        ArrayList<String> right = subseq1(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}

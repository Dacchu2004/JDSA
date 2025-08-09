package DSA.StringRecursion;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;

public class SubSeqAscii {
    public static void main(String[] args) {
        subseqascii("","abc");
        System.out.println(subseqascii1("","abc"));
    }
    static void subseqascii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqascii(p+ch,up.substring(1));
        subseqascii(p,up.substring(1));
        subseqascii(p+(ch+0),up.substring(1));
    }

    //returning an arraylist of string but passing the arraylist inside the function body itself
    static ArrayList<String> subseqascii1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqascii1(p+ch,up.substring(1));
        ArrayList<String> second = subseqascii1(p,up.substring(1));
        ArrayList<String> third = subseqascii1(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

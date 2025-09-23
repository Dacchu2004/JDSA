package DSA.StringRecursion;

import java.util.ArrayList;

public class Subset_LetterCombination {
    public static void main(String[] args) {
//        keypad("","12");
        System.out.println(pad("","12"));
    }

    static void keypad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0'; //this will convert '2' into 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char) ('a'+i);
            keypad(p+ch,up.substring(1));
        }
    }

    //returning arraylist
    static ArrayList<String> pad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        for(int i=(digit-1)*3;i<(digit*3);i++){
            char ch=(char) ('a'+i);
            list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }

    //count of combinations
    static int padCount(String p,String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}

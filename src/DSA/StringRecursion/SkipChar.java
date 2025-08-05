package DSA.StringRecursion;

public class SkipChar {
    public static void main(String[] args) {
        skip("","never ever give up");
    }

    static void skip(String p, String up){ //p means processed up means unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch=='e'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }
}

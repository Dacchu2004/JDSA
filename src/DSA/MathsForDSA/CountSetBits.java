package DSA.MathsForDSA;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 9;
        int count = 0;

//        while(n>0){
//            count ++;
//            n-=(n&-n);
//        }
        // or using n = n& n-1;
        while(n>0){
            count ++;
            n=(n&n-1);
        }
        System.out.println(Integer.toBinaryString(n));
        System.out.println(count);
    }
}

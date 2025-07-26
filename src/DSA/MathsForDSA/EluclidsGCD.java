package DSA.MathsForDSA;

public class EluclidsGCD {
    public static void main(String[] args) {
        System.out.println(gcd(4,9)); // 4 and 9 are co-primes
    }
    static int gcd(int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}

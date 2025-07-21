package DSA.Recurrsion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4)); // but when n=50; it won't give the answer/output bcoz the recursion tree will be actually re-evaluating the same things over and over again
    }
    static  int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

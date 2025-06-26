package DSA.LinearSearch;

import java.util.Scanner;

public class EvenDigs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter:");
        int n=in.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter "+ n +" numbers");
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }

        System.out.println(findnum(nums));
    }

    static int findnum(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numdigs=digits(num);
//        if(numdigs%2==0){
//            return true;
//        }
//        return false;
        return numdigs%2==0;
    }

    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

//optimized way to find the digits without iterating to every digits
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);
    }

}

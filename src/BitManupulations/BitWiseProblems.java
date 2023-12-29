package BitManupulations;

import java.util.*;

public class BitWiseProblems {
    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{1,2,2,1,3,3,4
        }));

    }
    //Given an array of integers A, every element appears twice except for one.
    // Find that integer that occurs once.

    public static int singleNumber(final int[] A) {
        int a=0;
        for(int i=0;i<A.length;i++)
        {
            a^=A[i];
        }
        return a;
    }

//    Write a function that takes an integer and returns the number of 1 bit
//    present in its binary representation.
    public static int numSetBits(int A) {
        int count=0;
        while(A>0)
        {
            if((A&1) == 1)
            {
                count++;
            }
            A = A>>1;
        }
        return count;

    }
//    Given two binary strings A and B. Return their sum (also a binary string).

    public static String addBinary(String A, String B) {
        int i = A.length()-1;
        int j = B.length()-1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while(i>=0 || j>=0)
        {
            int sum=carry;
            if(i>=0) sum+=A.charAt(i--)-'0';
            if(j>=0) sum+=B.charAt(j--)-'0';

            res.append(sum%2);
            carry = sum>1?1:0;
        }
        if(carry!=0) res.append(carry);
        return res.reverse().toString();
    }


}

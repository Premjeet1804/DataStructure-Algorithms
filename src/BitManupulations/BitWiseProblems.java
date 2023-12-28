package BitManupulations;

import java.util.*;

public class BitWiseProblems {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,2,1,3,3,4
        }));
        System.out.println(numSetBits(3));
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


}

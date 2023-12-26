package Intro_to_Problem_Solving;

import java.util.ArrayList;
import java.util.List;

public class TwoGreaterElements {
//    Problem Description:
//    You are given an array of distinct integers A, you have to find
//    and return all elements in array which have at-least two greater elements than themselves.
//
//    NOTE: The result should have the order in which they are present in the original array.

//    Example Input
//
//    Input 1:
//
//    A = [1, 2, 3, 4, 5]
//    Input 2:
//
//    A = [11, 17, 100, 5]
//
//
//    Example Output
//
//    Output 1:
//
//            [1, 2, 3]
//    Output 2:
//
//            [11, 5]
            public static void main(String[] args) {
                System.out.println(solve(new int[]{1,2,3,4,5,6}));
            }
    public static int[] solve(int[] A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i]>max2)
            {
                max2 = A[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<max1 && A[i]<max2)
            {
                list.add(A[i]);
            }
        }
        int []ans = new int[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = list.get(i);
        }
        return ans;


    }
}

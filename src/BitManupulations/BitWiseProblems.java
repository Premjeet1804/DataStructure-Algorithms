package BitManupulations;

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
}

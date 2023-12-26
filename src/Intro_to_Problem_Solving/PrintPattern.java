package Intro_to_Problem_Solving;

public class PrintPattern {
//        Problem Description
//        Print a Pattern According to The Given Value of A.
//        Example: For A = 3 pattern looks like:
//
//        1 0 0
//        1 2 0
//        1 2 3
    public static void main(String[] args) {

        int [][]pattern = solve(3);

        for(int i=0;i< pattern.length;i++)
        {
            for(int j=0;j<pattern[0].length;j++)
            {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

    }
    public static int[][] solve(int n) {

        int [][]ans = new int [n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                ans[i][j] = j+1;
            }
        }
        return ans;

    }
}

package Intro_to_Problem_Solving;

public class IntroductionToProblemSolving {
    public static void main(String[] args) {
        System.out.println(IsPrime(5));
    }

    //Time Complexity O(√N)
    // Space Complexity O(1)
    public static boolean IsPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

}

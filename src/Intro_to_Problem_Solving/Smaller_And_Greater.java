package Intro_to_Problem_Solving;
import  java.util.*;

public class Smaller_And_Greater {

    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<Integer>(){{add(1);
        add(2);
        add(3);
        add(4);}}));
    }
    public static int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i=0;i<A.size();i++)
        {
            min = Math.min(min,A.get(i));
            max = Math.max(max,A.get(i));
        }
        int count=0;
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>min && A.get(i)<max) count++;
        }
        return count;
    }
}

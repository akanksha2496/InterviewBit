Question:
https://www.interviewbit.com/problems/max-distance/

Max Distance

Medium

393

19
Asked In:
Google
Amazon
Microsoft
Problem Description

Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].



Input Format
First and only argument is an integer array A.



Output Format
Return an integer denoting the maximum value of j - i;



Example Input
Input 1:

 A = [3, 5, 4, 2]


Example Output
Output 1:

 2


Example Explanation
Explanation 1:

 Maximum value occurs for pair (3, 4).





Solution video:
https://www.youtube.com/watch?v=Zyhxzg0WLWA

Solution:


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        int[] leftmin=new int[A.length];
        int[] rightmax=new int[A.length];
        leftmin[0]=A[0];
        rightmax[A.length-1]=A[A.length-1];
        for(int i=1;i<A.length;i++)
        {
            leftmin[i]=Math.min(leftmin[i-1],A[i]);
        }
         for(int i=A.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],A[i]);
        }
        int x=0, y=0, ans=Integer.MIN_VALUE;
        while(x<A.length && y<A.length)
        {
            if(leftmin[x]<=rightmax[y])
            {
                ans=Math.max(ans,y-x);
                y++;
            }
            else
            x++;
        }
        return ans;
    }
}

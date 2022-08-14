Length of Longest Subsequence

Medium

196

12
Asked In:
Microsoft
Directi
Flipkart
more
Problem Description
 
 

Given an 1D integer array A of length N, find the length of longest subsequence which is first increasing then decreasing.



Problem Constraints
0 <= N <= 3000

 -107 <= A[i] <= 107



Input Format
The first and the only argument contains an integer array A.



Output Format
Return an integer representing the answer as described in the problem statement.



Example Input
Input 1:

 A = [1, 2, 1]
Input 2:

 A = [1, 11, 2, 10, 4, 5, 2, 1]


Example Output
Output 1:

 3
Output 2:

 6


Example Explanation
Explanation 1:

 [1, 2, 1] is the longest subsequence.
Explanation 2:

 [1 2 10 4 2 1] is the longest subsequence.
 
 Approcah: https://www.youtube.com/watch?v=TWHytKnOPaQ
 1.longest Incresing subsequesce from left.
 2.LIS from right
 3. add both left + right -1(so that same eleemnt cant added twice) 
 4. max sum is answer.
 
 Code:
 public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestSubsequenceLength(final int[] A) {
        if(A.length==0 || A.length==1)
        return A.length;
        int[] longLeft=new int[A.length];
        int[] longRight=new int[A.length];
        Arrays.fill(longLeft,1);
        Arrays.fill(longRight,1);
        for(int i=1;i<A.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A[j]<A[i])
                {
                    longLeft[i]=Math.max(longLeft[j]+1,longLeft[i]);
                }
            }
        }
         for(int i=A.length-2;i>=0;i--)
        {
            for(int j=A.length-1;j>i;j--)
            {
                if(A[j]<A[i])
                {
                    longRight[i]=Math.max(longRight[j]+1,longRight[i]);
                }
            }
        }
        int max=1;
        for(int i=0;i<A.length;i++)
        {
            max=Math.max(max,longRight[i]+longLeft[i]-1);
        }
       return max; 
    }
}

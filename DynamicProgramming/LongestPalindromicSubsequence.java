Programming
/
Dynamic Programming
/
Longest Palindromic Subsequence
Longest Palindromic Subsequence

Medium

184

4
Asked In:
LinkedIn
BYJU'S
Problem Description
 
 

Given a string A, find the common palindromic sequence ( A sequence which does not need to be contiguous and is a pallindrome), which is common in itself.

You need to return the length of longest palindromic subsequence in A.

NOTE:

Your code will be run on multiple test cases (<=10). Try to come up with an optimised solution.


Problem Constraints
 1 <= |A| <= 1005



Input Format
First and only argument is an string A.



Output Format
Return a integer denoting the length of longest palindromic subsequence in A.



Example Input
Input 1:

 A = "bebeeed"


Example Output
Output 1:

 4


Example Explanation
Explanation 1:

 The longest common pallindromic subsequence is "eeee", which has a length of 4

code:
public class Solution {
    public int solve(String A) {
        int[][] dp=new int[A.length()+1][A.length()+1];
        String B="";
        for(int i=A.length()-1;i>=0;i--)
        B+=A.charAt(i);
        for(int i=0;i<A.length()+1;i++)
        {
            for(int j=0;j<A.length()+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(A.charAt(i-1)==B.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[A.length()][A.length()];
    }
}

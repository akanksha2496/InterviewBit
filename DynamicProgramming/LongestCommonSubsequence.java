

Longest Common Subsequence

Easy

232

9
Asked In:
Ajio
Problem Description

Given two strings A and B. Find the longest common sequence ( A sequence which does not need to be contiguous), which is common in both the strings.

You need to return the length of such longest common subsequence.



Problem Constraints
1 <= |A|, |B| <= 1005



Input Format
First argument is an string A.

Second argument is an string B.



Output Format
Return the length of such longest common subsequence between string A and string B.



Example Input
Input 1:

 A = "abbcdgf"
 B = "bbadcgf"


Example Output
Output 1:

 5


Example Explanation
Explanation 1:

 The longest common subsequence is "bbcgf", which has a length of 5





code:
public class Solution {
    public int solve(String A, String B) {
        int[][] dp=new int[A.length()+1][B.length()+1];
        for(int i=1;i<=A.length();i++)
        {
            for(int j=1;j<=B.length();j++)
            {
                if(i==0 || j==0)
                dp[i][j]=0;
                else if(A.charAt(i-1)==B.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[A.length()][B.length()];
    }
}

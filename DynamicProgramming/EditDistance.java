Programming
/
Dynamic Programming
/
Edit Distance
Edit Distance

Medium

300

8
Asked In:
Google
LinkedIn
Microsoft
more
Given two strings A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character


Input Format:

The first argument of input contains a string, A.
The second argument of input contains a string, B.
Output Format:

Return an integer, representing the minimum number of steps required.
Constraints:

1 <= length(A), length(B) <= 450
Examples:

Input 1:
    A = "abad"
    B = "abac"

Output 1:
    1

Explanation 1:
    Operation 1: Replace d with c.

Input 2:
    A = "Anshuman"
    B = "Antihuman"

Output 2:
    2

Explanation 2:
    => Operation 1: Replace s with t.
    => Operation 2: Insert i.
   
  code:
  public class Solution {
    public int minDistance(String A, String B) {
        int[][] dp=new int[A.length()+1][B.length()+1];
        for(int i=0;i<A.length()+1;i++)
        {
            for(int j=0;j<B.length()+1;j++)
            {
                if(i==0)
                dp[i][j]=j;
                else if(j==0)
                dp[i][j]=i;
                else if(A.charAt(i-1)==B.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
                else
                dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
            }
        }
        return dp[A.length()][B.length()];
    }
}

   

Coin Sum Infinite

Medium

131

27
Asked In:
Microsoft
Deloitte
You are given a set of coins S. In how many ways can you make sum N assuming you have infinite amount of each coin in the set.

Note : Coins in set S will be unique. Expected space complexity of this problem is O(N).

Example :

Input : 
	S = [1, 2, 3] 
	N = 4

Return : 4

Explanation : The 4 possible ways are
{1, 1, 1, 1}
{1, 1, 2}
{2, 2}
{1, 3}	
Note that the answer can overflow. So, give us the answer % 1000007

code: https://www.youtube.com/watch?v=RTpV8H8qYw4

public class Solution {
    public int coinchange2(int[] A, int B) {
        int[][] dp=new int[B+1][A.length];
        for(int i=0;i<A.length;i++)
        dp[0][i]=1;
        for(int i=1;i<B+1;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                int op1=0;
                if(i>=A[j])
                op1=dp[i-A[j]][j];
                int op2=0;
                if(j>0)
                op2=dp[i][j-1];
                dp[i][j]=(op1+op2)%1000007;
            }
        }
        return dp[B][A.length-1];
    }
}

Min Jumps Array

Medium

212

18
Asked In:
Amazon
Ebay
Google
Given an array of non-negative integers, A, of length N, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Return the minimum number of jumps required to reach the last index.

If it is not possible to reach the last index, return -1.

Input Format:

The first and the only argument contains an integer array, A.
Output Format:

Return an integer, representing the answer as described in the problem statement.
Constraints:

1 <= N <= 1e6
0 <= A[i] <= 50000
Examples:

Input 1:
    A = [2, 1, 1]

Output 1:
    1
    
Explanation 1:
    The shortest way to reach index 2 is
        Index 0 -> Index 2
    that requires only 1 jump.

Input 2:
    A = [2,3,1,1,4]

Output 2:
    2

Explanation 2:
    The shortest way to reach index 4 is
        Index 0 -> Index 1 -> Index 4
    that requires 2 jumps.
    
    
    
  code:
  public class Solution {
    public int jump(int[] A) {
    int maxJump=0,reach=0, jump=0;
    for(int i=0;i<A.length-1;i++)
    {
        maxJump=Math.max(maxJump,i+A[i]);
        if(i==reach)
        {
            jump++;
            reach=maxJump;
        }   
    }
    if(reach<A.length-1) return -1;
    return jump;
}}

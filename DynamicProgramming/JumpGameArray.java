Jump Game Array

Medium

151

2
Asked In:
Amazon
Ebay
Given an array of non-negative integers, A, you are initially positioned at the 0th index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.



Input Format:

The first and the only argument of input will be an integer array A.
Output Format:

Return an integer, representing the answer as described in the problem statement.
    => 0 : If you cannot reach the last index.
    => 1 : If you can reach the last index.
Constraints:

    1 <= len(A) <= 106


    0 <= A[i] <= 30

Examples:

Input 1:
    A = [2,3,1,1,4]

Output 1:
    1

Explanation 1:
    Index 0 -> Index 2 -> Index 3 -> Index 4

Input 2:
    A = [3,2,1,0,4]

Output 2:
    0

Explanation 2:
    There is no possible path to reach the last index.
    
    
code video apprach: https://www.youtube.com/watch?v=muDPTDrpS28

code:
public class Solution {
    public int canJump(int[] A) {
        if(A.length==1 && A[0]==0)
        return 1;
        if(A[0]==0)
        return 0;
        int reachable=0;
        for(int i=0;i<A.length;i++)
        {
            if(i>reachable)
            return 0;
            reachable=Math.max(reachable,i+A[i]);
        }
        return 1;
    }
}

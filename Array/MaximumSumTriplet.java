Question-
  
Maximum Sum Triplet

Medium

463

49
Asked In:
Directi
LIDO Learning
Problem Description
 
 

Given an array A containing N integers.

You need to find the maximum sum of triplet ( Ai + Aj + Ak ) such that 0 <= i < j < k < N and Ai < Aj < Ak.

If no such triplet exist return 0.



Problem Constraints
3 <= N <= 105.

1 <= A[i] <= 108.



Input Format
First argument is an integer array A.



Output Format
Return a single integer denoting the maximum sum of triplet as described in the question.



Example Input
Input 1:

 A = [2, 5, 3, 1, 4, 9]
Input 2:

 A = [1, 2, 3]


Example Output
Output 1:

 16
Output 2:

 6


Example Explanation
Explanation 1:

 All possible triplets are:-
    2 3 4 => sum = 9
    2 5 9 => sum = 16
    2 3 9 => sum = 14
    3 4 9 => sum = 16
    1 4 9 => sum = 14
  Maximum sum = 16
Explanation 2:

 All possible triplets are:-
    1 2 3 => sum = 6
 Maximum sum = 6
   
 Solution video for concept-
     https://www.youtube.com/watch?v=03bbQ_1Sg0M
   
   
  Solution -
   
   public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        //left subaaray max element lower then x, x, max subaaray;
        int[] maxR=new int[n];
        int max=0;
        maxR[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--)
        maxR[i]=Math.max(maxR[i+1],A[i]);
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(A[0]);
        for(int i=1;i<n-1;i++)
        {
            set.add(A[i]);
            Integer left=set.lower(A[i]);
            int right=maxR[i];
            if(left!=null && right!=A[i])
            max=Math.max(max,left+A[i]+right);
        }
        return max;
    }
}

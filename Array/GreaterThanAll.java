Greater than All

Very Easy

22

5
Asked In:
TCS
Problem Description
 
 

Given an integer array A.
Find the count of elements whose value is greater than all of its previous elements.

Note: Since there are no elements before first element so it should be considered in our answer.


Problem Constraints
1 <= |A| <= 105
1 <= Ai <= 109


Input Format
Given an integer array A.


Output Format
Return an integer.


Example Input
Input 1:
A = [1, 2, 3, 4]
Input 2:

A = [1, 1, 2, 2]


Example Output
Output 1:
4
Output 2:

2


Example Explanation
Explanation 1:
All elements are greater than all of its prior elements.
Explanation 2:

Index 1 will be considerd in answer.
Also Elements at index 3 is greater than all of it's previous elements.

Solution:

time O(n) and O(n) space.

public class Solution {
    public int solve(int[] A) {
      int[] prefix=new int[A.length+1];
      prefix[0]=Integer.MIN_VALUE;
      for(int i=1;i<A.length;i++)
      {
          prefix[i]=Math.max(prefix[i-1],A[i-1]);
      }
      int count=1;
      for(int i=1;i<A.length;i++)
      {
          if(A[i]>prefix[i])
            {count++;}
      }
      return count;
    }
}


time O(n) and O(1) space.

public class Solution {
    public int solve(int[] A) {
        int count = 0;
        int max = 0;
        for(int i=0;i<A.length;i++) {
            if(max<A[i]) {
                count++;
                max = A[i];
            }
            
        }
        return count;
    }
}

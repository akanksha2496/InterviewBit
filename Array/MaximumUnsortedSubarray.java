Maximum Unsorted Subarray

Medium

204

24
Asked In:
Amazon
Microsoft
Problem Description
 
 

Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,..., Ar such that if we sort(in ascending order) that sub-array, then the whole array should get sorted.
If A is already sorted, output -1.



Problem Constraints
1 <= N <= 1000000

1 <= A[i] <= 1000000



Input Format
First and only argument is an array of non-negative integers of size N.



Output Format
Return an array of length two where the first element denotes the starting index(0-based) and the second element denotes the ending index(0-based) of the sub-array. If the array is already sorted, return an array containing only one element i.e. -1.



Example Input
Input 1:

A = [1, 3, 2, 4, 5]
Input 2:

A = [1, 2, 3, 4, 5]


Example Output
Output 1:

[1, 2]
Output 2:

[-1]


Example Explanation
Explanation 1:

If we sort the sub-array A1, A2, then the whole array A gets sorted.
Explanation 2:

A is already sorted.
  
 Solution:
public class Solution {
    public int[] subUnsort(int[] A) {
        int[] preMax=new int[A.length];
        int[] suffMin=new int[A.length];
        preMax[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            preMax[i]=Math.max(preMax[i-1],A[i]);
        }
        suffMin[A.length-1]=A[A.length-1];
        for(int i=A.length-2;i>=0;i--)
        {
            suffMin[i]=Math.min(suffMin[i+1],A[i]);
        }
        int[] ans=new int[2];
        int c=0,t1=0;
        for(int i=0;i<A.length;i++)
        {
            if(preMax[i]!=suffMin[i])
            {ans[c]=i;++c;
            t1=i;
            if(c==1)
            break;
            }
        }
        for(int i=A.length-1;i>t1;i--)
        {
            if(preMax[i]!=suffMin[i])
            {ans[c]=i;++c;
            if(c==2)
            break;
            }
        }
        
        if(c==2)
        return ans;
        int[] t={-1};
        return t;
    }
}

// 1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15
// 1  1  10  10  15  15  15  15  15  15  15  15
// 1  1  10  10  10  10  10  10  10  10  10  15

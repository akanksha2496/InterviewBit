Question-
  https://www.interviewbit.com/problems/maximum-absolute-difference/
  Maximum Absolute Difference

Medium

470

27
Asked In:
Amazon
You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.

f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.

For example,

A=[1, 3, -1]

f(1, 1) = f(2, 2) = f(3, 3) = 0
f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.

Solution video-
https://www.youtube.com/watch?v=tN8wEDNZKF4  
  
Solution-

public class Solution {
    public int maxArr(int[] A) {
        int n=A.length;
        int ans=0,max_1=Integer.MIN_VALUE,max_2=Integer.MIN_VALUE,min_1=Integer.MAX_VALUE,min_2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
           max_1=Math.max(max_1, (A[i]+i));
           max_2=Math.max(max_2, (A[i]-i));
           min_1=Math.min(min_1, (A[i]+i));
           min_2=Math.min(min_2, (A[i]-i));
        }
        ans=Math.max(max_1-min_1,max_2-min_2);
        return ans;
    }
}

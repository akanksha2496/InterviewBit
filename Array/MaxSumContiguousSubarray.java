Question -
Max Sum Contiguous Subarray

Easy

388

21
Asked In:
Facebook
Paypal
Yahoo
more
Find the contiguous subarray within an array, A of length N which has the largest sum.

Input Format:

The first and the only argument contains an integer array, A.
Output Format:

Return an integer representing the maximum possible sum of the contiguous subarray.
Constraints:

1 <= N <= 1e6
-1000 <= A[i] <= 1000
For example:

Input 1:
    A = [1, 2, 3, 4, -10]

Output 1:
    10

Explanation 1:
    The subarray [1, 2, 3, 4] has the maximum possible sum of 10.

Input 2:
    A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Output 2:
    6

Explanation 2:
    The subarray [4,-1,2,1] has the maximum possible sum of 6.
    
Solution -
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int curr_sum=0,max_sum=Integer.MIN_VALUE,n=A.length;
        int end=-1,start=-1;
        for(int i=0;i<n;i++)
        {
            if(curr_sum<0)
               curr_sum=0;
           curr_sum=curr_sum+A[i];
           max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;     
    }
}

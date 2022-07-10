
Question - https://www.interviewbit.com/problems/partitions/
Problem Description

You are given a 1D integer array B containing A integers.

Count the number of ways to split all the elements of the array into 3 contiguous parts so that the sum of elements in each part is the same.

Such that : sum(B[1],..B[i]) = sum(B[i+1],...B[j]) = sum(B[j+1],...B[n]) 



Problem Constraints
1 <= A <= 105

-109 <= B[i] <= 109



Input Format
First argument is an integer A.

Second argument is an 1D integer array B of size A.



Output Format
Return a single integer denoting the number of ways to split the array B into three parts with the same sum.



Example Input
Input 1:

 A = 5
 B = [1, 2, 3, 0, 3]
Input 2:

 A = 4
 B = [0, 1, -1, 0]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 There are no 2 ways to make partitions -
 1. (1,2)+(3)+(0,3).
 2. (1,2)+(3,0)+(3).
Explanation 2:

 There is only 1 way to make partition -
 1. (0)+(-1,1)+(0).

Video for concept- https://www.youtube.com/watch?v=qFbBi5kOq5U

Solution -

public class Solution {
    //https://www.youtube.com/watch?v=qFbBi5kOq5U
    public int solve(int A, int[] B) {
        int sum=0;
        int ans=0;
        for(int i=0;i<B.length;i++)
        {sum+=B[i];}
        int partCount=sum/3;
        sum=0;
        ArrayList<Integer> prefix=new ArrayList<Integer>();
        ArrayList<Integer> suffix=new ArrayList<Integer>();
        for(int i=0;i<B.length;i++)
        {
            if(sum+B[i]==partCount)
            prefix.add(i);
            sum+=B[i];
        } 
        sum=0;
        for(int i=B.length-1;i>=0;i--)
        {
            if(sum+B[i]==partCount)
            suffix.add(i);
            sum+=B[i];
        }
        for(int i=0;i<prefix.size();i++)
        {
            for(int j=0;j<suffix.size();j++)
            {
                if(prefix.get(i)<suffix.get(j) && prefix.get(i)+1<suffix.get(j))
                {
                    int c=0;
                    for(int k=prefix.get(i)+1;k<suffix.get(j);k++)
                    c+=B[k];
                    if(c==partCount)
                    ans++;
                }
            }
        }
         return ans;
    }
}

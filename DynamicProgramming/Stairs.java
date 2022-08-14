Stairs

Easy

134

5
Asked In:
Morgan Stanley
Amazon
Intel
more
You are climbing a stair case and it takes A steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Input Format:

The first and the only argument contains an integer A, the number of steps.
Output Format:

Return an integer, representing the number of ways to reach the top.
Constrains:

1 <= A <= 36
Example :

Input 1:

A = 2 Output 1:

2 Explanation 1:

[1, 1], [2] Input 2:

A = 3 Output 2:

3 Explanation 2: 

[1 1 1], [1 2], [2 1]

code:
public class Solution {
    public int climbStairs(int A) {
        int[] n=new int[100];
        n[0]=1;
        n[1]=1;
        for(int i=2;i<=A;i++)
        {
            n[i]=n[i-1]+n[i-2];
        }
        return n[A];
    }
}

code : 2 sapce 
public class Solution {
    public int climbStairs(int A) {
        int[] n=new int[2];
        n[0]=1;
        n[1]=1;
        for(int i=2;i<=A;i++)
        {
            
            int a=n[0]+n[1];
            n[0]=n[1];
            n[1]=a;
            
            
        }
        return n[1];
    }
}



Programming
/
Dynamic Programming
/
Smallest Sequence With Given Primes
Smallest sequence with given Primes

Medium

190

4
Asked In:
Booking.Com
Microsoft
Directi
Problem Description
 
 

Given three prime numbers A, B and C and an integer D.

You need to find the first(smallest) D integers which only have A, B, C or a combination of them as their prime factors.



Input Format
First argument is an integer A.

Second argument is an integer B.

Third argument is an integer C.

Fourth argument is an integer D.



Output Format
Return an array of size D denoting the first smallest D integers which only have A, B, C or a combination of them as their prime factors.

NOTE: You need to return the array sorted in ascending order.



Example Input
Input 1:

 A = 2
 B = 3
 C = 5
 D = 5


Example Output
Output 1:

 [2, 3, 4, 5, 6]


Example Explanation
Explanation 1:

 4 = A * A i.e ( 2 * 2 ) 
 6 = A * B i.e ( 2 * 3 )


Code:
public class Solution {
    public int[] solve(int A, int B, int C, int D) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=0,k=0;
        arr.add(1);
        int[] ans=new int[D];
        int d=D;
        while(D-->0)
        {
            int x=Math.min(arr.get(i)*A,Math.min(arr.get(j)*B,arr.get(k)*C));
            arr.add(x);
            
            if(x==arr.get(i)*A)
            i++;
            if(x==arr.get(j)*B)
            j++;
            if(x==arr.get(k)*C)
            k++;
        }
        arr.remove(0);
        for(int i1=0;i1<d;i1++)
        ans[i1]=arr.get(i1);
        return ans;
    }
}


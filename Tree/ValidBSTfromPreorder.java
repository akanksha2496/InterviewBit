


Valid BST from Preorder

Bookmark
Medium
46.5% Success

290

122
Asked In:
Unbxd Inc.
Problem Description
 
 

You are given a preorder traversal A, of a Binary Search Tree.

Find if it is a valid preorder traversal of a BST.

Note: Binary Search Tree by definition has distinct keys and duplicates in binary search tree are not allowed.



Problem Constraints
1 <= A[i] <= 106

1 <= |A| <= 105



Input Format
First and only argument is an integer array A denoting the pre-order traversal.



Output Format
Return an integer:

0 : Impossible preorder traversal of a BST
1 : Possible preorder traversal of a BST


Example Input
Input 1:

A = [7, 7, 10, 10, 9, 5, 2, 8]


Example Output
Output 1:

 0










code:

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Stack<Integer> s=new Stack<>();
        int root=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++)
        {
            while(s.size()>0 && A.get(i)>=s.peek())
            {
                root=s.peek();
                s.pop();
            }
            if(A.get(i)<=root)
            return 0;
            s.push(A.get(i));
        }        
        return 1;
    }
}

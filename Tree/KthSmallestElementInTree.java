Kth Smallest Element In Tree

Bookmark
Medium
48.0% Success

216

33
Asked In:
Amazon
Given a binary search tree, write a function to find the kth smallest element in the tree.

Example :

Input : 
  2
 / \
1   3

and k = 2

Return : 2

As 2 is the second smallest element in the tree.
NOTE : You may assume 1 <= k <= Total number of nodes in BST

code:
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    ArrayList<Integer> ans=new ArrayList<>();
    public void inorderTraversal(TreeNode A){
        if(A!=null)
        {
            inorderTraversal(A.left);
            
            ans.add(A.val);
            inorderTraversal(A.right);            
        }
    }
    public int kthsmallest(TreeNode A, int B) {
         inorderTraversal(A);
         return ans.get(B-1);
    }
}

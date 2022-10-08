Right view of Binary tree

Bookmark
Medium
63.1% Success

205

7
Asked In:
DE Shaw
ThoughtWorks
Problem Description

Given a binary tree A of integers. Return an array of integers representing the right view of the Binary tree.

Right view of a Binary Tree: is a set of nodes visible when the tree is visited from Right side.



Problem Constraints
1 <= Number of nodes in binary tree <= 105

0 <= node values <= 109 



Input Format
First and only argument is an pointer to the root of binary tree A.



Output Format
Return an integer array denoting the right view of the binary tree A.



Example Input
Input 1:

        1
      /   \
     2    3
    / \  / \
   4   5 6  7
  /
 8 
Input 2:

    1
   /  \
  2    3
   \
    4
     \
      5


Example Output
Output 1:

 [1, 3, 7, 8]
Output 2:

 [1, 3, 4, 5]
 
 
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
    public ArrayList<Integer> solve(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.add(root);
        
        while(queue.size() > 0){
            int size = queue.size();
            int count = 0;
            while(size-- > 0){
               TreeNode rem = queue.remove();
               if(count == 0){
                   ans.add(rem.val);
                   count++;
               } 
               
               if(rem.right != null)
                    queue.add(rem.right);
               if(rem.left != null)
                    queue.add(rem.left);
                    
            }
        }
        
        return ans;
    }
}


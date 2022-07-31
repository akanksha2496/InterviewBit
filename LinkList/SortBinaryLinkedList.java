Sort Binary Linked List

Easy

188

7
Asked In:
Amazon
Problem Description

Given a Linked List A consisting of N nodes.

The Linked List is binary i.e data values in the linked list nodes consist of only 0's and 1's.

You need to sort the linked list and return the new linked list.

NOTE:

Try to do it in constant space.


Problem Constraints
 1 <= N <= 105

 A.val = 0 or A.val = 1



Input Format
First and only argument is the head pointer of the linkedlist A.



Output Format
Return the head pointer of the new sorted linked list.



Example Input
Input 1:

 1 -> 0 -> 0 -> 1
Input 2:

 0 -> 0 -> 1 -> 1 -> 0


Example Output
Output 1:

 0 -> 0 -> 1 -> 1
Output 2:

 0 -> 0 -> 0 -> 1 -> 1


Example Explanation
Explanation 1:

 The sorted linked list looks like:
  0 -> 0 -> 1 -> 1
Explanation 2:

 The sorted linked list looks like:
  0 -> 0 -> 0 -> 1 -> 1
    
   Solution:

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        if(A.next==null)
        return A;
        int zero=0;
        int one=0;
        ListNode start=A;
        while(start!=null)
        {
            if(start.val==1)
            ++one;
            else if(start.val==0)
            ++zero;
            start=start.next;
        }
        start=A; 
        while(zero>0)
        {
            start.val=0;
            --zero;
            start=start.next;
        }
        while(one>0)
        {
          start.val=1;
          --one;
          start=start.next;
        }
        return A;
        
    }
}

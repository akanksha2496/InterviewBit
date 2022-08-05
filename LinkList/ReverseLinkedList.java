Reverse Linked List

Easy

91

4
Reverse a linked list. Do it in-place and in one-pass.

For example:

Given 1->2->3->4->5->NULL,

return 5->4->3->2->1->NULL.

PROBLEM APPROACH :

Complete solution code in the hints

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A) {
         if(A==null || A.next==null)
        return A;
        ListNode prev=null, curr=A, next;
        while(curr!=null)
        {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        return prev;
    }
}

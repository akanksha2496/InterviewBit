Swap List Nodes in pairs

Easy

227

9
Asked In:
Microsoft
Amazon
Moonfrog Labs
Given a linked list, swap every two adjacent nodes and return its head.

For example,

Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

code:
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A==null || A.next==null )
        return A;
        ListNode p=A, q=A.next,b=A;   
        p.next=q.next;
        q.next=p;
        A=q;
        while(p.next!=null && p.next.next!=null)
        {
            b=p;
            p=p.next;
            q=p.next;
            p.next=q.next;
            q.next=p;
            b.next=q;
        }
         return A;
     }
}

Remove Duplicates from Sorted List

Easy

181

4
Asked In:
Microsoft
VMWare
Goldmann Sachs
more
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,

Given 1->1->2, return 1->2.

Given 1->1->2->3->3, return 1->2->3.

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
    public ListNode deleteDuplicates(ListNode A) {
    if(A==null || A.next==null)
    return A;
    ListNode p=A;
    while(p!=null)
    {
        if(p.next!=null && p.val == p.next.val)
        p.next=p.next.next;
        else
        p=p.next;
    }
    return A;
    }
}

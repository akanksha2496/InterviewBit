Remove Nth Node from List End

Easy

148

14
Asked In:
HCL
Amazon
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:

If n is greater than the size of the list, remove the first node of the list.
Try doing it using constant additional space.

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
    public ListNode removeNthFromEnd(ListNode A, int B) {
        if(A==null || A.next==null)
        return null;
        int count=1;
        ListNode temp=A;
        while(temp.next!=null)
        {
            ++count;
            temp=temp.next;
        }
        if(B>=count)
        {
            A=A.next;
            return A;
        }
        B=count-B;
        temp=A;
        ListNode prev=A;
        while(B-->0)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
        return A;
        prev.next=temp.next;
        return A;
    }
}

Rotate List

Medium

174

13
Asked In:
Amazon
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:

Given 1->2->3->4->5->NULL and k = 2,

return 4->5->1->2->3->NULL.

solution:- https://www.youtube.com/watch?v=_zrtqC-jSFM

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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode prev=head,temp=head;
        int count=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            ++count;
        }
        
         if(count==k)
        return head;
        k%=count;
        int ind=count-k-1;
        while(ind-->0)
        {
            prev=prev.next;
        }
        temp.next=head;
        head=prev.next;
        prev.next=null;
        return head;
    }
}

Merge Two Sorted Lists

Easy

211

4
Asked In:
Microsoft
Yahoo
Amazon
Merge two sorted linked lists and return it as a new list. 

The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.

For example, given following linked lists :

  5 -> 8 -> 20 
  4 -> 11 -> 15
The merged list should be :

4 -> 5 -> 8 -> 11 -> 15 -> 20

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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode p1=A,q1=B,head=null,temp=null;
        if(p1.val<q1.val)
        {
            head=p1;
            temp=head;
            p1=p1.next;
        }
        else
        {
            head=q1;
            temp=head;
            q1=q1.next;
        }
        while(p1!=null && q1!=null)
        {
            if(p1.val<q1.val)
            {
                temp.next=p1;
                temp=temp.next;
                p1=p1.next;
            }
            else{
                temp.next=q1;
                temp=temp.next;
                q1=q1.next;
            }
        }
        while(p1!=null)
        {
             temp.next=p1;
                temp=temp.next;
                p1=p1.next;
        }
        while(q1!=null)
        {
            temp.next=q1;
                temp=temp.next;
                q1=q1.next; 
        }
        return head;
    }
}

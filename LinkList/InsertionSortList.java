Insertion Sort List

Medium

163

7
Asked In:
Microsoft
Google
Sort a linked list using insertion sort.

We have explained Insertion Sort at Slide 7 of Arrays

Insertion Sort Wiki has some details on Insertion Sort as well.

Example :

Input : 1 -> 3 -> 2

Return 1 -> 2 -> 3

Solution video:  https://www.youtube.com/watch?v=rNhFZSwYuWE
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
    public ListNode insertionSortList(ListNode head) {//5 1 4 3 2
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode sorted=null;//need to return;
        while(temp!=null)
        {
            ListNode curr=temp;
             temp=temp.next;
            if(sorted==null || sorted.val>curr.val)
            {curr.next=sorted;
            sorted=curr;}
            else{
                ListNode s=sorted;
                while(s!=null)
                {
                    if(s.next==null || s.next.val>curr.val)
                    {
                        curr.next=s.next;
                        s.next=curr;
                        break;
                    }
                    s=s.next;
                }
            }
        }
        return sorted;
    }
}

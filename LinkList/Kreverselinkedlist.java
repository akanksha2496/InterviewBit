K reverse linked list

Medium

251

4
Asked In:
Microsoft
Amazon
Given a singly linked list and an integer K, reverses the nodes of the

list K at a time and returns modified linked list.

NOTE : The length of the list is divisible by K

Example :

Given linked list 1 -> 2 -> 3 -> 4 -> 5 -> 6 and K=2,

You should return 2 -> 1 -> 4 -> 3 -> 6 -> 5

Try to solve the problem using constant extra space.

Solution video-
https://www.youtube.com/watch?v=oyZzgEy5WAQ

Code:
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head, int B) {
        ListNode next=head,prevtail=head, curhead=head ,cur=head,prev=null;
        boolean check=false;
        int count=0;
       while(next!=null)
       { 
           curhead=cur;
           prev=null;
           count=B;
           while(count>0)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            --count;
        }
        if(!check)
        {
            head=prev;
            check=true;
        }
        else
        {
            prevtail.next=prev;
            prevtail=curhead;
        }
        
        }
        return head;
    }
}

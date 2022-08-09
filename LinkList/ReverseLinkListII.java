Reverse Link List II

Medium

191

3
Asked In:
Facebook
Microsoft
Amazon
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:

Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:

Given m, n satisfy the following condition:

1 ≤ m ≤ n ≤ length of list.

Note 2:

Usually the version often seen in the interviews is reversing the whole linked list which is obviously an easier version of this question.

code: just keep 2 pointer and reverser the m to n list and keep checking corner case's for 1 to n;

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
    public ListNode reverseBetween(ListNode A, int B, int C) {
       ListNode m=A,m1=null,n=A,n1=null;
       if(A==null || A.next==null || B==C)
       return A;
       if(B==1)
       {
           m1=m;
       }
       while(B-->1)
       {
           m1=m;
           m=m.next;
       }        
       while(C-->1)
       {
           n1=n;
           n=n.next;
       }
       n1=n.next;
       n.next=null;
       ListNode prev=null, cur=m, next=m;
       while(cur!=null)
       {
           next=cur.next;
           cur.next=prev;
           prev=cur;
           cur=next;
       }
       if(m!=m1)
       {m1.next=prev;
       m.next=n1;}
       else
       {
           m1.next=n1;
           return prev;
       }
       return A;
    }
}

Remove Duplicates from Sorted List II

Medium

205

4
Asked In:
Microsoft
VMWare
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,

Given 1->2->3->3->4->4->5, return 1->2->5.

Given 1->1->1->2->3, return 2->3.

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
        ListNode p=A,prev=null;
        while(p!=null)
        {
            if(p.next!=null && p.val == p.next.val)
            { 
                
            ListNode temp=p.next;
             while(temp!=null)
             {
                if(temp!=null && temp.val==p.val)
                {
                    temp=temp.next;
                }else{
                if(A.val==p.val)
                A=temp;
                if(prev==null)
                prev=temp;
                else
                 prev.next=temp;
                 p=temp;
                 
                 break;   
                }
             }
             if(temp==null)
             {
                 if(A.val==p.val)
                 return null;
                 else
                 prev.next=temp;
                 break;
             }
            }
            else
            {prev=p;
                p=p.next;}
            
        }
        return A;
    }
}

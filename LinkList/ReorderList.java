Programming
/
Linked Lists
/
Reorder List
Reorder List

Hard

232

7
Asked In:
Amazon
Microsoft
Given a singly linked list

    L: L0 → L1 → … → Ln-1 → Ln,
reorder it to:

    L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
You must do this in-place without altering the nodes’ values.

For example,

Given {1,2,3,4}, reorder it to {1,4,2,3}.

Logic: 
1. Divide whole list in 2 part by middle.
2. Reverse the 2nd list which saprated after middle.
3. append 1st and 2nd list in alternate order. By keeping 1st list elemnet in first and then keep 2nd list element in 2nd order.

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
    public ListNode reorderList(ListNode A) {
        if(A==null || A.next==null)
        return A;
        // middle
        int count=0;
        ListNode temp=A;
        while(temp!=null)
        {
            ++count;
            temp=temp.next;
        }
        int mid=(count/2);
        ListNode revList=A;
        temp=null;
        while(mid-->0)
        {
            temp=revList;
            revList=revList.next;
        }
        // if(temp.next==null)
        // return A;
        temp.next=null;
    //   reverse : the 2nd list
     ListNode prev=null, cur=revList, next=revList;
     while(cur!=null)
     {
         next=cur.next;
         cur.next=prev;
         prev=cur;
         cur=next;
     }
     revList=prev;
    //   merge alternatively
    ListNode first=A, second=revList,second2=revList;
    while(second!=null){
        second2=second.next;
        if(first.next==null)
        {
            first.next=second;
            break;
        }
        second.next=first.next;
        first.next=second;
        first=first.next.next;
        second=second2;
    }
    return A;
    }
}

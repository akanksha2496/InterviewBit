Even Reverse

Medium

145

23
Asked In:
Amazon
Problem Description

Given a linked list A , reverse the order of all nodes at even positions.



Problem Constraints
1 <= Size of linked list <= 100000



Input Format
First and only argument is the head of the Linked-List A.



Output Format
Return the head of the new linked list.



Example Input
Input 1:

A = 1 -> 2 -> 3 -> 4
Input 2:

A = 1 -> 2 -> 3


Example Output
Output 1:

 1 -> 4 -> 3 -> 2
Output 2:

 1 -> 2 -> 3


Example Explanation
Explanation 1:

Nodes are positions 2 and 4 have been swapped.
Explanation 2:

No swapping neccassary here.







video _ https://www.youtube.com/watch?v=SX5zx4cPLoM
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
    public ListNode solve(ListNode head) {
        if(head==null || head.next==null || head.next.next==null || head.next.next==null)
        return head;
        ListNode even=null, odd=head, temp=null;
        while(odd!=null && odd.next!=null)
        {
            temp=odd.next;
            odd.next=temp.next;
            temp.next=even;
            even=temp;
            odd=odd.next;
        }
        //now we have 2 saparate list - odd and reverse even list.
        odd=head;
        temp=even.next;
        while(even!=null)
        {
            temp=even.next;
            even.next=odd.next;
            odd.next=even;
            odd=odd.next.next;
            even=temp;
        }
        return head;
    }
}

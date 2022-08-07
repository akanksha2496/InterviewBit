List Cycle

Medium

286

15
Asked In:
Amazon
Microsoft
NetApp
Problem Description

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

Example:

Input: 


              ______
             |     |
             \/    |
    1 -> 2 -> 3 -> 4


Return the node corresponding to node 3. 

video code solution: https://www.youtube.com/watch?v=Qo1GXMgIjxk
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
	public ListNode detectCycle(ListNode a) {
        ListNode slow=a, fast=a;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
            if(fast==null) return null;
            fast=fast.next;
            if(slow==fast)
            break;
        }
        if(fast==null)
        return null;
        fast=a;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
	}
}






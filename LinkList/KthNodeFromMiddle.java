Kth Node From Middle

Easy

130

6
Asked In:
Amazon
Problem Description

Given a linked list A of length N and an integer B.

You need to find the value of the Bth node from the middle towards the beginning of the Linked List A.

If no such element exists, then return -1.

NOTE:

Position of middle node is: (N/2)+1, where N is the total number of nodes in the list.


Problem Constraints
1 <= N <= 105
1<= Value in Each Link List Node <= 103
1 <= B <= 105


Input Format
First argument is the head pointer of the linkedlist A.

Second argument is an integer B.



Output Format
Return an integer denoting the value of the Bth from the middle towards the head of the linked list A. If no such element exists, then return -1.



Example Input
Input 1:

 A = 3 -> 4 -> 7 -> 5 -> 6 -> 1 6 -> 15 -> 61 -> 16
 B = 3
 Input 2:

 A = 1 -> 14 -> 6 -> 16 -> 4 -> 10
 B = 2
 Input 3:

 A = 1 -> 14 -> 6 -> 16 -> 4 -> 10
 B = 10


Example Output
Output 1:

 4
 Output 2:

 14
 Output 3:

 -1


Example Explanation
Explanation 1:

 The Middle of the linked list is the node with value 6.
 The 1st node from the middle of the linked list is the node with value 5.
 The 2nd node from the middle of the linked list is the node with value 7.
 The 3rd node from the middle of the linked list is the node with value 4.
 So we will output 4.
Explanation 2:

 The Middle of the linked list is the node with value 16.
 The 1st node from the middle of the linked list is the node with value 6.
 The 2nd node from the middle of the linked list is the node with value 14.
 So we will output 14.
Explanation 3:

 The Middle of the linked list is the node with value 16.
 There are only 3 nodes to the left of the middle node and we need to find the 10th node which doesn't exist so we will return -1.

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
    public int solve(ListNode A, int B) {
        int len=0;
        ListNode temp=A;
        while(temp!=null)
        {
            ++len;temp=temp.next;
        }
        int val=((len/2)+1)-B;
          if(val<=0 || A==null)
        return -1;
        int count=1;
        temp=A;
        while(temp!=null)
        {
            if(val==count)
            {
                return temp.val;
            }
            ++count;
            temp=temp.next;
            }
       
        return -1;
    }
}

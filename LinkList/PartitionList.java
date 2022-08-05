Partition List

Medium

200

17
Asked In:
Microsoft
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,

Given 1->4->3->2->5->2 and x = 3,

return 1->2->2->4->3->5.
  
  
  video link if doubt-> https://www.youtube.com/watch?v=yLL168YObrI
  
 Solution-
  /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int B) {
        ListNode hs=null,ts=null,hg=null,tg=null;
        boolean hsmila=false, hgmila=false;
        if(head.next==null || head==null)
        return head;
        while(head!=null)
        {
            if(head.val<B)
            {
                if(!hsmila)
                {
                    hs=head;
                    ts=head;
                    hsmila=true;
                }
                else
                {
                    ts.next=head;
                    ts=ts.next;                    
                }
            }else{
                
                 if(!hgmila)
                {
                    hg=head;
                    tg=head;
                    hgmila=true;
                }
                else
                {
                    tg.next=head;
                    tg=tg.next;                    
                }
            }
            head=head.next;
        } 
        if(hg==null) return hs;
        if(hs==null) return hg;
        ts.next=hg;
        tg.next=null;
        return hs;
    }
}

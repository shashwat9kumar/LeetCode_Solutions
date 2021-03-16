/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // ListNode head1 = l1, head2 = l2;
        ListNode l = new ListNode();
        ListNode head=l;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                l.next=l1;
                l1=l1.next;
                l=l.next;
            }
            else{
                l.next=l2;
                l2=l2.next;
                l=l.next;
            }
        }
        while(l1!=null){
            l.next=l1;
            l1=l1.next;
            l=l.next;
        }
        while(l2!=null){
            l.next=l2;
            l2=l2.next;
            l=l.next;
        }
        return head.next;
    }
}

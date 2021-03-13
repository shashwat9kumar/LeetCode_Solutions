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
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode curr = head;
        ListNode revlist = null;
        
        while(curr!=null){
            temp = curr.next;
            curr.next = revlist;
            
            revlist=curr;
            curr=temp;
        }
        return revlist;
    }
}

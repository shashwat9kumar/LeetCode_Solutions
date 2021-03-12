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
    public ListNode middleNode(ListNode head) {
        // Apply fast and slow pointer(slow jums 1 and fast jumps 2)
        ListNode fast=head, slow=head;
        while(fast!=null){
            if(fast.next == null){
                return slow;
            }
            else if(fast.next.next == null){
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return head;
    }
}

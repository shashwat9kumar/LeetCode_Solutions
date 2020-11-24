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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode();
        ListNode curr = head;
        int sum=0,carry=0;
        
        while(p != null || q != null){
            int dp = (p != null)?p.val:0;
            int dq = (q != null)?q.val:0;
            
            sum = dp + dq + carry;
            carry = sum/10;
            sum = sum % 10;
            curr.next = new ListNode(sum);
            
            curr = curr.next;
            if (p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return head.next;
    }
}

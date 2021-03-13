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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        
        
        while(temp!=null){
            if(temp.val== val){
                head = head.next;
                temp = head;
                continue;
            }
            
            else if(temp.next!=null){
                if(temp.next.val == val)
                {
                    temp.next = temp.next.next;
                    continue;
                }
            }
            temp=temp.next;
        }
        
        return head;
        
        
        
        
    }
}

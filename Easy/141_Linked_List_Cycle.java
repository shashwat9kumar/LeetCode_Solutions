/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // Floyd Cycle finding algorithm
        ListNode fast = head, slow = head;
        
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}



//          Using HashSet technique


//         ListNode temp = head;
//         HashSet<ListNode> set = new HashSet<ListNode>();
        
//         while(temp!=null){
//             if(set.contains(temp)){
//                 return true;
//             }
//             set.add(temp);
//             temp = temp.next;
//         }
//         return false;

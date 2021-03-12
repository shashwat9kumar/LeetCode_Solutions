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
    public boolean isPalindrome(ListNode head) {
        
        // Two Pointer approach 
        // 1. Find the middle of the list
        // 2. Find the reverse of the list from the middle node
        
        
        ListNode fast=head, slow=head;
        while(fast!=null && fast.next !=null){
            
            if(fast.next == null){
                break;
            }
            if(fast.next.next == null){
                slow=slow.next;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        // slow = slow.next;
        
        
        ListNode revlist = null;
        while(slow!=null){
            ListNode temp = slow.next;
            slow.next = revlist;
            
            revlist = slow;
            slow = temp;
        }
        
        ListNode forwlist = head;
        while(forwlist!=null && revlist!=null){
            if(forwlist.val != revlist.val){
                return false;
            }
            forwlist = forwlist.next;
            revlist = revlist.next;
        }
        return true;
    }
}

//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         ListNode temp = head;
//         while(temp != null){
//             arr.add(temp.val);
//             temp = temp.next;
//         }
        
//         int i=0;
//         int j=arr.size()-1;
//         int flag = 1;
//         while(i<j){
//             if(arr.get(i) != arr.get(j)){
//                 flag = -1;
//                 break;
//             }
//             i++;
//             j--;
//         }
//         if(flag == -1) return false;
//         else return true;

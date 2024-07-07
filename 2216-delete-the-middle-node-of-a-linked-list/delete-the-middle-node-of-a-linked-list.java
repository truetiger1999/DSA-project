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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode temp = head;
        int count = 0;
        
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        
        temp = head;
        
        
        int middle = count / 2;
        count = 0;
        
        // Traverse to the node just before the middle node
        while (temp != null) {
            count++;
            if (count == middle) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        
        return head;
    }
}

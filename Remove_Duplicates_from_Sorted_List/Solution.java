/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) 
            return null;
        if(head.next == null) 
            return head;
        ListNode node = head.next;
        ListNode cur = head;
        while(node != null){
            while(node != null && node.val == cur.val) 
                node = node.next;
            cur.next = node;
            cur = node;
            if(node != null) 
                node = node.next;
        }
        return head;
    }
}

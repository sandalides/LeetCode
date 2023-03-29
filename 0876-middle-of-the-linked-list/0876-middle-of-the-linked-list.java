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
        ListNode [] lst = new ListNode[100];
        int count =0;
        while(head != null){
            lst[count++] = head;
            head = head.next;
        }
        return lst[count/2];
    }
}
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
        ListNode mid1 = head;
        ListNode mid2 = head;
        while(mid2 != null && mid2.next != null) {
            mid1 = mid1.next;
            mid2 = mid2.next.next;
        }
        return mid1;
    }
}
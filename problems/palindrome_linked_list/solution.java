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
        if(head == null || head.next == null) {
            return true;
        }

        List<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int a = 0;
        int b = list.size() - 1;

        while(a < b) {
            if(list.get(a) != list.get(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
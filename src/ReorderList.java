public class ReorderList {
    public void reorderList(ListNode head) {
        // fast & slow pointers
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        ListNode next1 = null, next2 = null;
        while(slow != null && head.next != null){
            next1 = head.next;
            head.next = slow;
            head = next1;

            next2 = slow.next;
            slow.next = head;
            slow = next2;
        }
        while(head.next != null){
            head.next = null;
        }
    }

    public ListNode reverse(ListNode slow){
        ListNode curr = slow, prev = null, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

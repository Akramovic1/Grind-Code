public class MiddleOfTheLinkedList_Easy {
    public ListNode middleNode(ListNode head) {
        //fast & slow pointers
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

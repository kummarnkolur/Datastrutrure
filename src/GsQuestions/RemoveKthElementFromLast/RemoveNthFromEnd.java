package GsQuestions.RemoveKthElementFromLast;

public class RemoveNthFromEnd {
    public static ListNode removeKthFromEnd(ListNode head, int n) {
        // Create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize two pointers
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both fast and slow until fast reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        head = removeKthFromEnd(head, 2);
        System.out.println(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

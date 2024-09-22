public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(4)))))));
        deleteDuplicates(head);

    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode current = head;
        ListNode next = current.next;
        while (next != null) {
            if (current.val != next.val) {
                current.next = next;
                current = current.next;
            }

            next = next.next;
        }
        current.next = null;
        return head;
    }
}
// 1->1->2->3->3->4->null
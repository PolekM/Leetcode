public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        removeElement(listNode, 6);
    }

    public static ListNode removeElement(ListNode head, int val) {

        ListNode listNode = new ListNode(-1);
        ListNode current = listNode;
        while (head != null) {
            if (head.val != val) {
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }

        if (current.next != null && current.next.val == val) {
            current.next = null;
        }

        return listNode.next;
    }
}

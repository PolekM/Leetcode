import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode1 = reverseList(listNode);
        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }

    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

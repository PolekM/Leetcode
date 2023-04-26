import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        first.next = second;
        second.next = first;

        hasCycle(new ListNode(3));
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();
        if (head == null) {
            return false;
        }
        while (head.next != null) {
            if (listNodes.contains(head)) {
                return true;
            }
            listNodes.add(head);
            head = head.next;
        }
        return false;
    }


}

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode listNode2 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode listNode1 = addTwoNumbers(listNode, listNode2);
        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode nextResult = new ListNode();
        ListNode result = nextResult;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            nextResult.next = new ListNode(carry % 10);
            nextResult = nextResult.next;
            carry = carry / 10;
        }
        if (carry > 0) {
            nextResult.next = new ListNode(carry);
        }
        return result.next;
    }
}

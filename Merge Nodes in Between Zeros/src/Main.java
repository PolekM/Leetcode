public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0, null))))))));
        ListNode finalAnswer = mergeNodes(listNode);
        while (finalAnswer != null) {
            System.out.println(finalAnswer.val);
            finalAnswer = finalAnswer.next;
        }
    }

    public static ListNode mergeNodes(ListNode head) {
        int runningSum = 0;
        ListNode listNode = new ListNode();
        ListNode first = listNode;
        head = head.next;
        while (head != null) {
            runningSum += head.val;
            if (head.val == 0) {
                listNode.val = runningSum;
                if (head.next != null) {
                    listNode.next = new ListNode();
                    listNode = listNode.next;
                }
                runningSum = 0;
            }
            head = head.next;
        }

        return first;
    }

}

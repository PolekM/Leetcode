import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        System.out.println(pairSum(listNode));

    }

    public static int pairSum(ListNode head) {

        ListNode first = head;
        int nodeLenght = 1;

        while (head.next != null) {
            head = head.next;
            nodeLenght++;
        }

        nodeLenght = nodeLenght / 2;
        int[] max = new int[nodeLenght];
        for (int i = 0, j = nodeLenght - 1; j >= 0; i++) {
            if (i >= nodeLenght) {
                max[j] += first.val;
                j--;
            } else {
                max[i] = max[i] + first.val;
            }
            first = first.next;
        }

        return Arrays.stream(max).max().getAsInt();
    }

}

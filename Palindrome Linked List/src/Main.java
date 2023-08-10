import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1))));

        System.out.println(isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {

        ListNode pointer = head;
        Stack<Integer> stack = new Stack<>();
        while (pointer!=null){
                stack.add(pointer.val);
                pointer = pointer.next;
        }
        while (head!=null){
            if(head.val != stack.pop()){
                return false;
            }
            head = head.next;
        }

        return true;
    }
}

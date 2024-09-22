public class Main {

    public static void main(String[] args) {
        ListNode connectedList = new ListNode(2);
        connectedList.next = new ListNode(4);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);
        headA.next.next.next = connectedList;

        ListNode headB = new ListNode(3);
        headB.next = connectedList;
        System.out.println(getIntersectionNode(headA, headB));


    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pointerA = headA;
        ListNode pointerB = headB;
        int a = 0;
        int b = 0;
        while (headA != null || headB != null) {
            if (headA != null && headA.equals(headB)) {
                return headA;
            }
            if (headA != null) {
                a++;
                headA = headA.next;
            }
            if (headB != null) {
                b++;
                headB = headB.next;
            }

        }
        int counter = Math.abs(a - b);
        if (a > b) {
            for (int i = 0; i < counter; i++) {
                pointerA = pointerA.next;
            }
        }
        else if (a < b) {
                for (int i = 0; i < counter; i++) {
                    pointerB = pointerB.next;
                }
            }

        while(pointerA!=null && pointerB!=null){
            if(pointerA.equals(pointerB)){
                return pointerA;
            }
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }



        return null;
    }


}


public class Main {

    public static void main(String[] args) {
        ListNode firstList = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode secondList = new ListNode(1, new ListNode(3, new ListNode(4)));
        mergeTwoLists(firstList, secondList);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null && list2 == null)
            return list1;

       ListNode listNode = new ListNode(0);
       ListNode head = listNode;

       while(list1!=null && list2!=null){

           if(list1.val< list2.val){
               listNode.next = list1;
               list1 = list1.next;
           }
           else {
               listNode.next = list2;
               list2 = list2.next;
           }
            listNode = listNode.next;
       }
       if(list1==null){
           listNode.next = list2;
       }
       else {
           listNode.next = list1;
        }
        return head.next;
    }
}

//package List_Exercise;
//
//
//
////Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//
//public class Remove203 {
//    public static void main(String[] args) {
//        //1、初始化一个链表
//        ListNode m;
//        int[] a = {1,3,5,2,6,3,3};
//
//
//
//
//    }
//    public static ListNode removeElements(ListNode head, int val) {
//        ListNode p = new ListNode();
//        ListNode q,l;
//        p.next = head;
//        l = p;
//        q = p.next;
//        while (q!=null){
//            if (q.val == val){
//                p.next = q.next;
//                q = p.next;
//            }
//            else {
//                p = p.next;
//                q = q.next;
//            }
//        }
//        return l.next;
//    }
//}

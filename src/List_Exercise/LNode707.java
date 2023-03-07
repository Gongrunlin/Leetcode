//package List_Exercise;
//
//public class LNode707 {
//
//}
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(){}
//    ListNode(int val) {
//        this.val=val;
//    }
//}
//class MyLinkedList {
//    int size;
//    ListNode head;//虚拟头节点
//    public MyLinkedList() {
//        size = 0;
//        head = new ListNode(0);
//    }
//    public int get(int index) {
//
//        if (index< 0 || index >= size){
//            return -1;
//        }
//        ListNode p = head;
//        for (int i = 0; i <= index; i++) {
//            p = p.next;
//        }
//        return p.val;
//    }
//    public void addAtHead(int val) {
//        addAtIndex(0,val);
//    }
//    public void addAtTail(int val) {
//        addAtIndex(size,val);
//    }
//    public void addAtIndex(int index, int val) {
//        if (index>size) return;
//        if (index<0) index = 0;
//        size++;
//        ListNode p = head;
//        for (int i = 0; i < index; i++) {
//            p = p.next;
//        }
//        ListNode m = new ListNode(val);
//        m.next = p.next;
//        p.next = m;
//    }
//    public void deleteAtIndex(int index) {
//        if (index<0||index>=size){
//            return;
//        }
//        ListNode p = head;
//        for (int i = 0; i < index; i++) {
//            p = p.next;
//        }
//        p.next = p.next.next;
//        size--;
//    }
//}
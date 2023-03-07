package List_Exercise;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Reverce206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = null;
        for (int i = 1; i <= 5; i++) {
            ListNode m = new ListNode(i);
            m.next = head.next;
            head.next = m;
        }

        ListNode q = head.next;
        while (q!=null){
            System.out.println(q.val);
            q = q.next;
        }
        System.out.println("11111222223333");

    }

    public static int getListLen(ListNode l){
        int len = 0;
        while (l!=null){
            len++;
            l = l.next;
        }
        return len;
    }

    public static ListNode geti(ListNode h,int index){
        if (index == 0) return h;
        for (int i = 1; i <=index ; i++) {
            h = h.next;
        }
        return h;
    }

    public ListNode detectCycle(ListNode head) {
        int len = getListLen(head);
        ListNode q;
        for (int i = 0; i < len; i++) {
            //滚动到第i个结点
            q = geti(head,i);
            int step = len - i;
            ListNode r = q;
            while (step != 1){
                r = r.next;
                step--;
            }
            if (r == q) return q;
        }
        return null;
    }
}




package problems.p1_p99.p2;


public class Solution {
    public static void main(String[] args) {
        ListNode listNode111 = new ListNode(5);
        ListNode listNode11 = new ListNode(4, listNode111);
        ListNode listNode1 = new ListNode(3, listNode11);


        ListNode listNode222 = new ListNode(3);
        ListNode listNode22 = new ListNode(2, listNode222);
        ListNode listNode2 = new ListNode(1, listNode22);

        System.out.println(listNode1.val);
        System.out.println(listNode1.next.val);

        ListNode res = new Solution().addTwoNumbers(listNode1, listNode2);

        System.out.println(res.val);
        System.out.println(res.next.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode res = head;
        int transfer = 0;
        while (p != null || q != null) {
            int pVal = (p != null) ? p.val : 0;
            int qVal = (q != null) ? q.val : 0;
            int sum = pVal + qVal + transfer;
            System.out.println(sum);
            res.next = new ListNode(sum % 10);
            res = res.next;

            transfer = sum / 10;

            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (transfer != 0) {
            res.next = new ListNode(transfer);
        }
        return head.next;
    }
}

package priv.ethan.algorithm.list.solutions;

import priv.ethan.algorithm.list.common.ListNode;

/**
 * 删除链表的倒数第 n 个结点
 * <a href="https://leetcode-cn.com/problems/SLwz0R/"></a>
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1, head);
        ListNode p1 = dummyHead;
        ListNode p2 = dummyHead;
        while (n > 0) {
            p1 = p1.next;
            n--;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return dummyHead.next;
    }

}

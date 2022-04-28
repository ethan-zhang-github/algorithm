package priv.ethan.algorithm.list.common;

import java.util.stream.IntStream;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {}

    public ListNode(int val) { this.val = val; }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode generateRandom(int bound, int len) {
        return generate(IntStream.generate(() -> (int) (Math.random() * bound)).limit(len).toArray());
    }

    public static ListNode generate(int... nums) {
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException("nums can not be empty!");
        }
        return generate(nums, 0);
    }

    private static ListNode generate(int[] nums, int index) {
        if (index == nums.length - 1) {
            return new ListNode(nums[index]);
        }
        ListNode head = new ListNode(nums[index]);
        head.next = generate(nums, index + 1);
        return head;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode cursor = this;
        while (cursor != null) {
            builder.append(cursor.val).append(" -> ");
            cursor = cursor.next;
        }
        builder.append("null");
        return builder.toString();
    }

}

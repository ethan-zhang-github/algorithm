package priv.ethan.algorithm.num.solutions;

import priv.ethan.algorithm.num.common.Nums;

/**
 * 数组中的第K个最大元素
 * <a href="https://leetcode-cn.com/problems/kth-largest-element-in-an-array/"></a>
 */
public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, 0, nums.length - 1, k);
    }

    private int findKthLargest(int[] nums, int l, int r, int k) {
        int p = partition(nums, l, r);
        if (p == k - 1) {
            return nums[p];
        } else if (p > k - 1) {
            return findKthLargest(nums, l, p - 1, k);
        } else {
            return findKthLargest(nums, p + 1, r, k);
        }
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int cursor = l;
        for (int i = l; i < r; i++) {
            if (nums[i] > pivot) {
                Nums.swap(nums, i, cursor);
                cursor++;
            }
        }
        Nums.swap(nums, cursor, r);
        return cursor;
    }

}

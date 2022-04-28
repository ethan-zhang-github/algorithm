package priv.ethan.algorithm.num.common;

public class Nums {

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static int[] generate(int... nums) {
        return nums;
    }

}

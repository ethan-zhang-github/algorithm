package priv.ethan.algorithm.string.solutions;

/**
 * 无重复字符的最长子串
 * <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/"></a>
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        int border = 0;
        for (int l = 0; l < len; l++) {
            for (int r = border + 1; r < len; r++) {
                if (exists(chars, l, r)) {
                    break;
                }
                border = r;
            }
            res = Math.max(res, border - l + 1);
        }
        return res;
    }

    private boolean exists(char[] chars, int l, int r) {
        for (int i = l; i < r; i++) {
            if (chars[r] == chars[i]) {
                return true;
            }
        }
        return false;
    }

}

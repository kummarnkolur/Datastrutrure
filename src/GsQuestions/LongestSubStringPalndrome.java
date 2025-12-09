package GsQuestions;

public class LongestSubStringPalndrome {
    public String[] longestPalindrome(String s) {
        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd length palindrome
            int len1 = expand(s, i, i);
            // Check for even length palindrome
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }

        String palindrome = s.substring(start, start + maxLen);
        return new String[]{palindrome, String.valueOf(maxLen)};
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  // Length of palindrome
    }

    public static void main(String[] args) {
        LongestSubStringPalndrome ln=new LongestSubStringPalndrome();
        String[] str= ln.longestPalindrome("forgeeksskeegfor");
        System.out.println(str[0]+"-"+str[1]);
    }
}


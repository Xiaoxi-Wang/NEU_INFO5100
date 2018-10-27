public class Assignment4 {

    /**
     * The deadline of assignment4 is 10/12/2018 23:59 PST.
     * Please feel free to contact Zane and Amanda for any questions.
     */

    /*
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     * s = "leetcode" return 0.
     * s = "loveleetcode" return 2.
     */
    public int firstUniqChar(String s) {
        //TODO
        int[] freq = new int[26];
        // get the frequency of each character
        for (int i = 0; i < s.length(); i++) { freq[s.charAt(i) - 'a']++; }
        // get the index of first character with frequency == 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) { return i; }
        }
        return -1;
    }

    /*
     * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
        //TODO
        if (n == 0) { return 0; }
        if (n % 9 == 0) { return 9; }
        return n % 9;
    }

    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        //TODO
        int index = 0;
        for (int num : nums) {
            if (num != 0) { nums[index++] = num; }
        }
        while (index < nums.length) { nums[index++] = 0; }
    }

    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
    public String longestPalindrome(String s) {
        //TODO
        String res = "";
        int curLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (longestPalindromeHelper(s, i - curLen - 1, i)) {
                res = s.substring(i - curLen - 1, i + 1);
                curLen += 2;
            } else if (longestPalindromeHelper(s, i - curLen, i)) {
                res = s.substring(i - curLen, i + 1);
                curLen += 1;
            }
        }
        return res;
    }
    private boolean longestPalindromeHelper(String s, int start, int end) {
        if (start < 0) { return false; }
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) { return false; }
        }
        return true;
    }

    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
        //TODO
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix[0].length - j - 1] = temp;
            }
        }
        return matrix;
    }
}


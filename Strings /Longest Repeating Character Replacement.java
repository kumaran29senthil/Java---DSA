class Solution {
    public int characterReplacement(String s, int k) {
        int[] maxf = new int[26];
        int left = 0, maxFreq = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            maxf[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, maxf[s.charAt(right) - 'A']);
            if (right - left + 1 - maxFreq > k) {
                maxf[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

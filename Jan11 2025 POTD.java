/*Longest substring with distinct characters
Difficulty: EasyAccuracy: 31.32%Submissions: 148K+Points: 2
Given a string s, find the length of the longest substring with all distinct characters.*/

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

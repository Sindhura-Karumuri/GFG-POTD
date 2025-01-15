Longest Subarray with Sum K
Difficulty: MediumAccuracy: 24.64%Submissions: 549K+Points: 4
Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.

  class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == k) {
                maxLength = i + 1;
            }
            if (prefixSumMap.containsKey(prefixSum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(prefixSum - k));
            }
            if (!prefixSumMap.containsKey(prefixSum)) {
                prefixSumMap.put(prefixSum, i);
            }
        }
        return maxLength;
    }
}

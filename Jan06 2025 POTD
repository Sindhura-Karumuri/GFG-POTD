Sum Pair closest to target
Difficulty: EasyAccuracy: 44.75%Submissions: 46K+Points: 2
Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
         List<Integer> result = new ArrayList<>();
        if (arr.length < 2) {
            return result;
        }
        Arrays.sort(arr);
        int closestDiff = Integer.MAX_VALUE; 
        int maxAbsDiff = Integer.MIN_VALUE;
        int left = 0, right = arr.length - 1;
        while (left < right) { 
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            if (diff < closestDiff || (diff == closestDiff && (arr[right] - arr[left]) > maxAbsDiff)) {
                closestDiff = diff;
                maxAbsDiff = arr[right] - arr[left];
                result = Arrays.asList(arr[left], arr[right]);
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}

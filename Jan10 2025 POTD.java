/*Count distinct elements in every window
Difficulty: EasyAccuracy: 41.83%Submissions: 141K+Points: 2
Given an integer array arr[] and a number k. Find the count of distinct elements in every window of size k in the array.*/

class Solution {
ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            int j=i;
            HashSet<Integer> set = new HashSet<>();
            while(j<i+k){
                set.add(arr[j]);
                j++;
            }
            ans.add(set.size());
        }
        return ans;

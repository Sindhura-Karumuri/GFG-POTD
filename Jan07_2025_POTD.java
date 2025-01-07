/*Pair with given sum in a sorted array
Difficulty: EasyAccuracy: 26.04%Submissions: 83K+Points: 2
You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
Note: pairs should have elements of distinct indexes. */
  class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        HashMap<Integer,Integer> hs = new HashMap<>();
       int ans = 0;
       for(int i=0;i<arr.length;i++){
           int diff = target-arr[i];
           if(hs.containsKey(arr[i])){
               ans+=hs.get(arr[i]);
           }
           
           hs.put(diff,hs.getOrDefault(diff,0)+1);
       }
        return ans;
    }
}

Largest subarray of 0's and 1's
Difficulty: EasyAccuracy: 32.96%Submissions: 98K+Points: 2
Given an array arr of 0s and 1s. Find and return the length of the longest subarray with equal number of 0s and 1s.

  class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int ans=0;
        int cntOne=0;
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(arr[i]==1)cntOne++;
            else cntOne--;
            
            if(map.containsKey(cntOne))
                ans=Math.max(ans, i-map.get(cntOne));
            else 
                map.put(cntOne, i);
            
        }
        return ans;
    }
}

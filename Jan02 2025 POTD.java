Subarrays with sum K
Difficulty: MediumAccuracy: 49.74%Submissions: 54K+Points: 4
Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.
class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
       int count = 0;
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       int arrSum =0;
       map.put(0,1);
       for(int num : arr){
           arrSum+=num;
           if(map.containsKey(arrSum-k)){
               count += map.get(arrSum-k);
           }
           map.put(arrSum,map.getOrDefault(arrSum,0)+1);
       }
       return count;
    }
}

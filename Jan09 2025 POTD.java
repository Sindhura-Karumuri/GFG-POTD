Indexes of Subarray Sum
Difficulty: MediumAccuracy: 16.5%Submissions: 1.7MPoints: 4
Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
         ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        for(int i = 0; i < arr.length ; i++){
            int sum=arr[i];
            if (arr[i] == target){
                res.set(0,i+1);
                res.add(i+1);
                return res;
            }
            for(int j = i+1; j < arr.length ; j++){
                sum+=arr[j];
                if(sum == target){
                    res.set(0,i+1);
                    res.add(j+1);
                    return res;
                }
                else if(sum>target) break;
    
            }
        }
        return res ;
    }
}

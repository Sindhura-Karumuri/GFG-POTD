Container With Most Water
Difficulty: MediumAccuracy: 53.84%Submissions: 64K+Points: 4
Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis.

  class Solution {

    public int maxWater(int arr[]) {
        // Code Here
         int i=0,j=arr.length-1;
        int max=0;
        while(i<j){
           int min=Math.min(arr[i],arr[j]);
           max=Math.max(max,(min * (j-i)));
           if(arr[i]<arr[j]){
               i++;
           }else{
               j--;
           }
          
       }
       return max;
    }
}

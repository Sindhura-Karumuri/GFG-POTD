Equilibrium Point
Difficulty: EasyAccuracy: 28.13%Submissions: 613K+Points: 2
Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists

  class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
         int totalsum=0;
       int leftsum=0;
       int n=arr.length;
       for(int i=0;i<n;i++){
           totalsum+=arr[i];
       }
       for(int i=0;i<n;i++){
           totalsum-=arr[i];
           if(leftsum==totalsum){
               return i;
           }
           leftsum+=arr[i];
       }
      return -1;
    }
}

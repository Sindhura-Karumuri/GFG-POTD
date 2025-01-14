Trapping Rain Water
Difficulty: HardAccuracy: 33.14%Submissions: 454K+Points: 8
Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

  class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int leftMax = arr[0];
        Stack<Integer> rightMax = new Stack();
        rightMax.push(arr[n-1]);
        for (int i=n-2;i>=2;i--){
            int temp = Math.max(arr[i],rightMax.peek());
            rightMax.push(temp);
        }
        int total_water = 0;
        for(int i=1;i<n-1;i++){
            int watercapacity = Math.min(rightMax.peek(),leftMax);
            int tem = watercapacity-arr[i];
            int water  = Math.max(0,tem);
            total_water +=water;
            rightMax.pop();
            leftMax = Math.max(arr[i],leftMax);
        }
        return total_water;
    }
}
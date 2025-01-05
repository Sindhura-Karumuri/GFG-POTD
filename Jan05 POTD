class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0, high = n-1, c = 0;
        while(low<high) {
            if(arr[low]+arr[high]<target) {
                c+=(high-low);
                low++;
            } else{
                high--;
            }
        }
        return c;
    }
}


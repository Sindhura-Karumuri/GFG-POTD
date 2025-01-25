Count Subarrays with given XOR
Difficulty: MediumAccuracy: 58.86%Submissions: 13K+Points: 4
Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k

class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        long n=arr.length;
        long prefixxor=0;
        long cnt=0;
        HashMap<Long,Long>map=new HashMap<>();
        map.put(0L,1L);
        for(int i=0;i<n;i++){
            prefixxor^=arr[i];
            long target=prefixxor^k;
            cnt+=map.getOrDefault(target,0L);
            map.put(prefixxor,map.getOrDefault(prefixxor,0L)+1L);
        }
        return cnt;
    }
}

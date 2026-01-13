class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum=0;
        double avg=0;
        int n=nums.length;
        if( k > n || k <= 0){
            return 0;
        }
        for(int i=0;i<k;i++){
            maxsum=maxsum+nums[i];
        }
        int maximum=maxsum;
        for(int i=k;i<n;i++){
            maxsum=maxsum+nums[i]-nums[i-k];
            maximum=Math.max(maxsum,maximum);
        }
        
        return (double)maximum/k;
    }
}
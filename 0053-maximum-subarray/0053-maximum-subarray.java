class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int csum=0;
        for(int num:nums){
            csum+=num;
            maxsum=Math.max(maxsum,csum);
            if(csum<0){
                csum=0;
            }
        }
        return maxsum;
    }
}
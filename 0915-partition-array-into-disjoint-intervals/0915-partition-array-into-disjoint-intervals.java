class Solution {
    public int partitionDisjoint(int[] nums) {
        int left=nums[0];
        int max=nums[0];
        int right=nums.length;
        int count=1;
        for(int i=0;i<right;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]<left){
                count=i+1;
                left=max;
            }
        }
        return count;
    }
}
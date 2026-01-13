class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0,j=0;
        int n=nums.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n && j-i<=k;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] output=new int[n];
        int i=0,j=n-1;
        int left=0;
        for(int right=0;right<n;right++){
            if(nums[right]<pivot){
                output[i++]=nums[right];
            }
        }
        for(int right=n-1;right>=0;right--){
            if(nums[right]>pivot){
                output[j--]=nums[right];
            }
        }
        while(i<=j){
            output[i++]=pivot;
        }
        return output;
    }
}